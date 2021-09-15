import java.util.*;
public class UpperCaseConvert {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("My");
        words.add("Name");
        words.add("Is");
        words.add("Lambda");
        words.add("Functions");
        
        //Make the words upper case
        words.replaceAll(w->w.toUpperCase());
        for(String word:words)
            System.out.println(word);
    }
}
