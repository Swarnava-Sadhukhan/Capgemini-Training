import java.util.*;
import java.util.function.Consumer;

//Appends first letter of each word
public class AppendFirstLetters {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("My");
        words.add("Name");
        words.add("Is");
        words.add("Lambda");
        words.add("Functions");
        
        StringBuilder sb = new StringBuilder("");
        compute(words,(w)->sb.append(w));
        System.out.println(sb);
    }

    private static void compute(List<String> words, Consumer<String> c) {
        for(String word:words)
        {
            c.accept(word.substring(0,1));
        }
    }
}
