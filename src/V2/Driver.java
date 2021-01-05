package V2;

public class Driver {
    public static void main(String[] args) {
        //instantiate or create object
        Greeter greeter = new Greeter("World");

        //getword returns string hello
        String s = greeter.getWord();

        System.out.println(s);
    }
}
