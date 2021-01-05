package V4;

import java.util.Map;

public class Greeter {
    //member data
    private Template template;

    //constructor
    public Greeter(String s){
        template = new Template(s);
    }
    //getter
    public String getGreeting(Map<String, String> vars) {
       return template.instantiate(vars);
    }

}
