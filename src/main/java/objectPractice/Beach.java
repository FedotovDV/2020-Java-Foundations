package objectPractice;

public class Beach {
    public static void main(String[] args) {
        Woman woman1 = new Woman("Gloria", 20.0, 160.0, 40.0, "+9504214511");
        Woman woman2 = new Woman("Gloria", 20.0, 160.0, 40.0, "+9504214511");
        Woman woman3 = new Woman("Fiona", 21.0, 150.0, 40.0, "+9504214512");
        Woman woman4 = woman3;

        Woman[] womans = new Woman[]{woman1, woman2, woman3, woman4};
        printWoman(womans);
        System.out.println("woman1 == woman2 :"+ (woman1 == woman2));
        System.out.println("woman1 == woman3 :"+ (woman1 == woman3));
        System.out.println("woman4 == woman3 :"+ (woman4 == woman3));
        System.out.println("woman1.equals(woman2) :"+ (woman1.equals(woman2)));
        System.out.println("woman1.equals(woman3) :"+ (woman1.equals(woman3)));
        System.out.println("woman2.equals(woman1) :"+ (woman2.equals(woman1)));
        System.out.println("woman3.equals(woman1) :"+ (woman3.equals(woman1)));
        System.out.println("woman1.hashCode() = " + woman1.hashCode());
        System.out.println("woman2.hashCode() = " + woman2.hashCode());
        System.out.println("woman3.hashCode() = " + woman3.hashCode());
        System.out.println("woman4.hashCode() = " + woman4.hashCode());

    }

    private static void printWoman(Woman[] womans) {
        for(Woman woman: womans){
            System.out.println(woman.toString());
        }
    }
}
