public class Test {
    public static void main(String[] args) {
        System.out.println("Hello there.");
        System.out.println("General Kenobi.");

        int currentTemp = 59;
        String currentCity = "Arlington";

        System.out.println(currentTemp);
        System.out.println(currentCity);


        if(currentTemp < 60) {
            System.out.println("It's a bit chilly outside.");
        } else if(currentTemp < 70) {
            System.out.println("It's warming up.");
        } else {
            System.out.println("It's a bit warm outside.");
        }

        String s1 = new String("String");
        String s2 = new String("String");

        if(s1.equals(s2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }

        Greetings greetings = new Greetings();
        greetings.greeting();
        greetings.greeting("Duncan Idaho");
    }
}