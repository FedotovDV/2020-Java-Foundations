package testing.forWork;


import testing.forWork.group.Entity;
import testing.forWork.group.Group;
import testing.forWork.group.Trinity;

import java.io.*;
import java.util.*;
import java.util.Collections;


public class TrinitylRunner {


    private static Set<Trinity> allString = new HashSet<>();
    private static Map<Entity, ArrayList<Trinity>> groupString = new HashMap<>();
    private static Map<Integer, ArrayList<Group>> orderedGroup = new TreeMap<>(Collections.reverseOrder());


    private static int countGroup = 0;

    private final static String SEP = File.separator;
    private final static String FILEREADPATH = System.getProperty("user.dir") + SEP + "src"
            + SEP + "main" + SEP + "resources" + SEP + "lng.csv";
    private final static String FILEWRITEPATH = System.getProperty("user.dir") + SEP + "src"
            + SEP + "main" + SEP + "resources" + SEP + "test.txt";


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILEREADPATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                filterData(line.replace("\"", "").split(";", -1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        clearGroupWithoutPair();
        finalGrouping();
        saveInFile();
        long endTime = System.nanoTime();
        System.out.println("Total Time in Second: " + (endTime - startTime) / 1000000000f);
    }

    private static void filterData(String[] values) {
        if (values.length == 3) {
            Trinity trinity = new Trinity(values);
            if (!allString.contains(trinity) && trinity.isLegit()) {
                allString.add(trinity);
                primaryGrouping(trinity);
            }
        }
    }

    private static void primaryGrouping(Trinity trinity) {
        for (Entity entity : trinity.getLegitEntities()) {
            ArrayList<Trinity> trinityArrayList = groupString.getOrDefault(entity, new ArrayList<>());
            trinityArrayList.add(trinity);
            groupString.put(entity, trinityArrayList);
        }
    }

    private static void clearGroupWithoutPair() {
        Map<Entity, ArrayList<Trinity>> newGroupString = new HashMap<>();
        for (Map.Entry<Entity, ArrayList<Trinity>> entry : groupString.entrySet()) {
            if (entry.getValue().size() > 1) {
                newGroupString.put(entry.getKey(), entry.getValue());
            }
        }
        groupString = newGroupString;
    }

    private static void finalGrouping() {
        additionalGrouping();

        for (Map.Entry<Entity, ArrayList<Trinity>> entry : groupString.entrySet()) {
            ArrayList<Group> v = orderedGroup.getOrDefault(entry.getValue().size(), new ArrayList<>());
            Group group = new Group(entry.getValue());
            v.add(group);
            orderedGroup.put(group.size(), v);
            countGroup++;
        }
    }

    private static void additionalGrouping() {
        Map<Trinity, Integer> trinityCount = new HashMap<>();

        for (Map.Entry<Entity, ArrayList<Trinity>> entry : groupString.entrySet()) {
            ArrayList<Trinity> entities = entry.getValue();
            for (Trinity trinity : entities) {
                int value = trinityCount.getOrDefault(trinity, 0);
                trinityCount.put(trinity, value + 1);
            }
        }

        List<Set<Trinity>> multiEntitySubGroup = new ArrayList<>();
        for (Map.Entry<Trinity, Integer> entry : trinityCount.entrySet()) {
            if (entry.getValue() > 1) {
                Set<Trinity> set = new HashSet<>();
                for (Entity entity : entry.getKey().getLegitEntities()) {
                    if (groupString.containsKey(entity)) {
                        set.addAll(groupString.remove(entity));
                    }
                }
                if (set.size() > 1)
                    multiEntitySubGroup.add(set);
            }
        }

        for (Set<Trinity> subGroup : multiEntitySubGroup) {
            ArrayList<Group> v = orderedGroup.getOrDefault(subGroup.size(), new ArrayList<>());
            Group group = new Group(new ArrayList<>(subGroup));
            v.add(group);
            orderedGroup.put(group.size(), v);
            countGroup++;
        }
    }

    public static void saveInFile() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(FILEWRITEPATH));
            out.write("Кол-во групп " + countGroup + "\n");
            int count = 1;
            for (Map.Entry<Integer, ArrayList<Group>> entry : orderedGroup.entrySet()) {
                for (Group group : entry.getValue()) {
                    out.write("Группа " + count + "\n");
                    out.write(String.valueOf(group));
                    count++;
                }
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
