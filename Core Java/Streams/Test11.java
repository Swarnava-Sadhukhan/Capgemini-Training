import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<Trader> traders = Arrays.asList(
            new Trader("Swarnava","Kolkata"),
            new Trader("Parth","Pune"),
            new Trader("Ayush","Nainital"),
            new Trader("Onkar","Pune")
        );

        traders.stream()
        .sorted(Comparator.comparing(Trader::getName))        
        .forEach(t->System.out.print(t.getName()+" "));                              
    }
}