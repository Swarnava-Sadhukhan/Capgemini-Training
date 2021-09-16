import java.util.Arrays;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        List<Trader> traders = Arrays.asList(
            new Trader("Swarnava","Kolkata"),
            new Trader("Parth","Pune"),
            new Trader("Ayush","Indore"),
            new Trader("Onkar","Pune")
        );

        long n = traders.stream()
        .filter(t->t.getCity().equals("Indore"))      
        .count();
        System.out.println("Number of traders in Indore is - "+n);                              
    }
}
