import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Test14 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(new Trader("Swarnava","Kolkata"), 2011, 50000),
            new Transaction(new Trader("Parth","Delhi"), 2012, 40000),
            new Transaction(new Trader("Ayush","Nainital"), 2011, 60000),
            new Transaction(new Trader("Onkar","Delhi"), 2014, 45000)
        );


        Transaction t = transactions.stream()
        .max(Comparator.comparing(Transaction::getValue))
        .orElseThrow(NoSuchElementException::new);
        System.out.println(t);

    }
    
}
