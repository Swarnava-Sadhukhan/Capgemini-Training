import java.util.Arrays;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(new Trader("Swarnava","Kolkata"), 2011, 50000),
            new Transaction(new Trader("Parth","Delhi"), 2012, 40000),
            new Transaction(new Trader("Ayush","Nainital"), 2011, 60000),
            new Transaction(new Trader("Onkar","Delhi"), 2014, 45000)
        );

        transactions.stream()
        .filter(t -> (t.getTraderCity().equals("Delhi")))      
        .forEach(t->System.out.println(t.getValue()));
    }
    
}
