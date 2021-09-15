import java.util.*;

//Removes odd length words
public class RemoveOddWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("My");
        words.add("Name");
        words.add("Is");
        words.add("Lambda");
        words.add("Functions");
        words.removeIf(w -> ((w.length())%2==1));
        for(String word : words)
            System.out.println(word);
    }
}
