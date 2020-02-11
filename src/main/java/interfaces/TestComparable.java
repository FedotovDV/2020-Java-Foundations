package interfaces;


import java.util.Arrays;

public class TestComparable  {
    public static void main(String[] args) {
        int[] numsArray = new int[]{1,2,-2,3,0};
        Arrays.sort(numsArray);
        System.out.println("Arrays.toString(numsArray) = " + Arrays.toString(numsArray));
    }
}
