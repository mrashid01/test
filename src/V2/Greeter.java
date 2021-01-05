package V2;

public class Greeter {
    //member data
    private String word;

    //constructor
    public Greeter(String word){
        this.word = word;
    }
    public String getWord() {
        return "Hellow, " + word;
    }

}
