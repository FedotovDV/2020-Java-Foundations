package core;

public class WorkWithStatic {
    public static void main(String[] args) {
        Cat murzic = new Cat();
        Cat barsic = new Cat();
        murzic.setIsLoveMilk();

        System.out.println(murzic.isIsLoveMilk());
        System.out.println(barsic.isIsLoveMilk());


    }
}
