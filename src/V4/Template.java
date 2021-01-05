package V4;

import java.util.Map;

public class Template {
    private String[] words;

    public Template(String s){
        words = s.split("\\s");
    }
    public String instantiate(Map<String, String> args) {
        String[] translateword = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (isVariable(words[i])) {
                if (words[i].equals("$daypart"))
                    translateword[i] = (new DayPart()).toString();

                else if (args.containsKey(words[i])) {
                    translateword[i] = args.get(words[i]);
                }
            }

            else {
                translateword[i] = words[i];
            }
        }
        return String.join(" ", translateword);
    }
    private boolean isVariable(String s){
        return s.charAt(0) == '$';
    }

}
