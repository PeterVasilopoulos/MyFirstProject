import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello there.");
        System.out.println("General Kenobi.");

        int currentTemp = 59;
        String currentCity = "Arlington";

        System.out.println(currentTemp);
        System.out.println(currentCity);

        if (currentTemp < 60) {
            System.out.println("It's a bit chilly outside.");
        } else if (currentTemp < 70) {
            System.out.println("It's warming up.");
        } else {
            System.out.println("It's a bit warm outside.");
        }

        String s1 = new String("String");
        String s2 = new String("String");

        if (s1.equals(s2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }


        Greetings greetings = new Greetings();
        greetings.greeting();
        greetings.greeting("Duncan Idaho");


        int intNum = 516548453;
        short shortNum = (short) intNum;

        System.out.println("Int " + intNum);
        System.out.println("Short " + shortNum);


        long newLong = 2147392233324L;
        int newInt = (int) newLong;
        System.out.println("Long " + newLong);
        System.out.println("Int " + newInt);

        // Integer a = null;
        // int b = null;

        int[] myArr;
        myArr = new int[5];
        myArr[0] = 1;
        myArr[1] = 6;
        myArr[2] = 4;
        myArr[3] = 2;
        myArr[4] = 234;

        int[] myArr2 = {1, 2, 4, 6, 2};
        // System.out.println("Length of Array 2: " + myArr2.length());

        ArrayList<Integer> myArray = new ArrayList<Integer>();


        HashMap<String, String> hashbrowns = new HashMap<String, String>();
    }
}