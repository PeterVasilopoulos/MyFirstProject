public class Greetings {
    public void greeting() {
        System.out.println("Hello my friend.");
    }
    // Overloading Functions
    // same function name, but different signatures(parameters)
    public void greeting(String name) {
        System.out.println("Hello " + name);
    }
}
