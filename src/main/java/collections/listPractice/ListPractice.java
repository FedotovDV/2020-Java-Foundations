package collections.listPractice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Alexandr");
        arrayList.add("Ivan");
        arrayList.add("Vitaliy");
        arrayList.add("Dmitriy");
        arrayList.add("Andrey");
        arrayList.add("Ivan");
        for (String s : arrayList) {
            System.out.println("Name = " + s);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Name[" + i + "] = " + arrayList.get(i));
        }
        System.out.println("Вывод в обратном порядке:");
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println("Name[" + i + "] = " + arrayList.get(i));
        }


        String name1 = "Vasia";
        isNameInList(arrayList, name1);
        String name2 = "Ivan";
        isNameInList(arrayList, name2);

    }

    private static void isNameInList(List<String> arrayList, String name) {
        String nameInList;
        boolean flag = false;
        for (int i = 0; i < arrayList.size(); i++) {
            nameInList = arrayList.get(i);
            if (nameInList.equalsIgnoreCase(name)) {
                flag = true;
               System.out.println("Name " + name + " in index:" + i );
            }
        }
        if(!flag){
            System.out.println( name + " is not in this list");
        }
    }
}
