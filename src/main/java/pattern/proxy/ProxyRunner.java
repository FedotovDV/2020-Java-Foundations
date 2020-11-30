package pattern.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        DisplayTimetable displayTimetable = new DisplayTimetable();
        displayTimetable.printTimetable();

        System.out.println("*******************************************************************************");
        displayTimetable.printTimetable();

        System.out.println("*******************************************************************************");
        displayTimetable.printTimetable();
    }
}
