package collections.listPractice.person;

import collections.listPractice.person.EnumGender;
import collections.listPractice.person.Person;

import java.util.*;

public class PersonColletions {


    public static void main(String[] args) {
        List<Person> allPeople = insertPeopleInList();
        searchForMilitaryMen(allPeople);
        middleAgeSearch(allPeople);
    }

    private static void middleAgeSearch(List<Person> allPeople) {
        System.out.println("\nНайти средний возраст всех женщин.");
        int allAge = 0;
        int count = 0;
        for (Person person : allPeople) {
            if (person.getGender() == EnumGender.FEMALE) {
                allAge += person.getAge();
                count++;
            }
        }
        System.out.println("Cредний возраст всех женщин = " + (allAge / count));
    }

    private static void searchForMilitaryMen(List<Person> allPeople) {
        System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н");
        for (Person person : allPeople) {
            if (person.getAge() < 27 && person.getAge() > 18
                    && person.getGender() == EnumGender.MALE
                    && person.getName().charAt(0) == 'N') {
                System.out.println(person.toString());
            }
        }
    }

    private static ArrayList<Person> insertPeopleInList() {
        Person man1 = new Person("Ivan", 28, EnumGender.MALE);
        Person man2 = new Person("Nikolay", 23, EnumGender.MALE);
        Person man3 = new Person("Petr", 18, EnumGender.MALE);
        Person man4 = new Person("Nikita", 19, EnumGender.MALE);
        Person woman1 = new Person("Alla", 28, EnumGender.FEMALE);
        Person woman2 = new Person("Mariya", 19, EnumGender.FEMALE);
        Person woman3 = new Person("Sofiya", 35, EnumGender.FEMALE);
        Person woman4 = new Person("Lisa", 15, EnumGender.FEMALE);
        Person[] arrayPeople = new Person[]{man1, man2, man3, man4, woman1, woman2, woman3, woman4};
        return new ArrayList<>(Arrays.asList(arrayPeople));
    }
}
