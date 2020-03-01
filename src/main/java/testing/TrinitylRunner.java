package testing;




import java.io.*;
import java.util.*;


public class TrinitylRunner {
    private static Set<Trinity> allString = new HashSet<>();
    private static Map<Trinity, ArrayList<Trinity>> groupString = new HashMap<>();
    private static Map<Trinity, ArrayList<Trinity>> orderedGroup = new TreeMap<>();
    private static Map<Trinity, ArrayList<Trinity>> arrayListHashMap = new HashMap<>();
    private static Set<ArrayList<Trinity>> sortGroup = new TreeSet<>(new sizeComporator());


    private static int countGroup = 0;

    private final static String SEP = File.separator;
    private final static String FILEPATH = System.getProperty("user.dir") + SEP + "src"
            + SEP + "main" + SEP + "resources" + SEP + "lng.csv";


    public static void main(String[] args) {
        long startTime = System.nanoTime();
        readFile();
//        for (Trinity trinity : allString) {
//            createStringArray(trinity);
//        }
        orderedGroup.putAll(groupString);
        for (Map.Entry<Trinity, ArrayList<Trinity>> mapElement : orderedGroup.entrySet()) {
            if (mapElement.getValue().size() > 1) {
                sortGroup.add(mapElement.getValue());
                countGroup++;
            }
        }
        System.out.println("countGroup = " + countGroup);
        for(ArrayList arrayList: sortGroup){
                      System.out.println(arrayList.toString());
        }

        long endTime = System.nanoTime();
        System.out.println("Total Time in Second: " + (endTime - startTime) / 1000000000f);
    }

    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                filterData(line.split(";", -1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void filterData(String[] arrayString) {
        if (arrayString.length == 3) {
            Trinity trinity = new Trinity(arrayString);
            allString.add(trinity);
            ArrayList<Trinity> trinityArrayList = new ArrayList<>();
            trinityArrayList.add(trinity);
            groupString.put(trinity, trinityArrayList);
            createStringArray(trinity);
        }
    }

    private static void createStringArray(Trinity trinity) {

        for (Map.Entry<Trinity, ArrayList<Trinity>> mapElement : groupString.entrySet()) {
           if (((mapElement.getKey().compareTo(trinity) == 0))&&(!mapElement.getKey().equals(trinity))  ) {
                ArrayList<Trinity> trinityArrayList = mapElement.getValue();
                trinityArrayList.add(trinity);
               arrayListHashMap.put(mapElement.getKey(),trinityArrayList);
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
