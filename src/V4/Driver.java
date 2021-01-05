package V4;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        String templateStr = "Good $daypart $name - that is a nice $color shirt";
        Map<String, String > templateVar = new HashMap<String, String>();

        templateVar.put("$name", "Sheila");
        templateVar.put("$color", "green");

        Greeter mygreeter = new Greeter(templateStr);
        String s = mygreeter.getGreeting(templateVar);
        System.out.println(s);
        
    }
}
