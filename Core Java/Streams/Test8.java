import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(new Trader("Swarnava","Kolkata"), 2011, 50000),
            new Transaction(new Trader("Parth","Mumbai"), 2012, 40000),
            new Transaction(new Trader("Ayush","Nainital"), 2011, 60000),
            new Transaction(new Trader("Onkar","Mumbai"), 2014, 45000)
        );

        transactions.stream()
        .filter(t -> (t.getYear()==2011))
        .sorted(Comparator.comparing(Transaction::getValue))       
        .forEach(System.out::println);
    }
    
}
