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
    private static Set<ArrayList<Trinity>> sortGroup = new TreeSet<>(new sizeComporator());


    private static int countGroup = 0;

    private final static String SEP = File.separator;
    private final static String FILEPATH = System.getProperty("user.dir") + SEP + "src"
            + SEP + "main" + SEP + "resources" + SEP + "lng.csv";


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                filterData(line.replace("\"", "").split(";", -1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        clearGroupWithoutPair();
        finalGrouping();
        print();
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

    public static void print() {
        System.out.println("Кол-во групп " + countGroup);
        int count = 1;
        for (Map.Entry<Integer, ArrayList<Group>> entry : orderedGroup.entrySet()) {
            for (Group group : entry.getValue()) {
                System.out.println("Группа " + count + "\n");
                System.out.println(group);
                count++;
            }
        }
    }



    private static class sizeComporator implements Comparator<ArrayList<Trinity>> {

        @Override
        public int compare(ArrayList<Trinity> t1, ArrayList<Trinity> t2) {
            if (t1.size() < t2.size()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
