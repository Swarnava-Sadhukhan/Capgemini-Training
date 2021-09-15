import java.util.Map;
import java.util.*;
import java.util.function.Consumer;
public class AppendKeyValues {
    public static void main(String[] args) {
        Map<String,String> words = new HashMap<>();
        words.put("Hello","Alexa");
        words.put("My","Name");
        words.put("Is","Lambda");
        
        StringBuilder sb = new StringBuilder("");
        compute(words,(w)->sb.append(w.getKey()).append(" ").append(w.getValue()).append(" "));
        System.out.println(sb);
    }

    private static void compute(Map<String,String> words, Consumer<Map.Entry<String,String>> c) {
        for (Map.Entry<String,String> entry : words.entrySet())
        {
            c.accept(entry);
        }
    }
}
