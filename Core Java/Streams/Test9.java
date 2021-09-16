import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(new Trader("Swarnava","Kolkata"), 2011, 50000),
            new Transaction(new Trader("Parth","Mumbai"), 2012, 40000),
            new Transaction(new Trader("Ayush","Nainital"), 2011, 60000),
            new Transaction(new Trader("Onkar","Mumbai"), 2014, 45000)
        );

        Map<String,List<Transaction>> transMap = transactions.stream()
        .collect(Collectors.groupingBy(Transaction::getTraderCity));

        for(String s:transMap.keySet())
        {
            System.out.println(s);
        }
    }
}
