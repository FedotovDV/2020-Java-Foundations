package core.lesson1;

public class LeapYearCount {

    public static void main(String[] args) {
        System.out.println(leapYearCount(100));
    }

    public static int leapYearCount(int year) {
//        return (int) Math.round(year*0.2425);
        return year/4-year/100+year/400;
    }

}
