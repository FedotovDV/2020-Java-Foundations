package recursion;

public class BinarySearchRun {

        public static void main(String[] args) {
            int maxSize = 100;
            BinarySearchApp ordArray = new BinarySearchApp(maxSize, new int[]{72, 90, 45, 126, 54, 99, 144, 27, 135, 81, 18, 108, 9, 117, 63, 36});
//            ordArray.insert(72);
//            ordArray.insert(90);
//            ordArray.insert(45);
//            ordArray.insert(126);
//            ordArray.insert(54);
//            ordArray.insert(99);
//            ordArray.insert(144);
//            ordArray.insert(27);
//            ordArray.insert(135);
//            ordArray.insert(81);
//            ordArray.insert(18);
//            ordArray.insert(108);
//            ordArray.insert(9);
//            ordArray.insert(117);
//            ordArray.insert(63);
//            ordArray.insert(36);
            ordArray.display();
           int index = ordArray.find(27);
            System.out.println("index(27) = " + index);
        }

}
