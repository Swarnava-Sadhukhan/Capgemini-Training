import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<News> news = Arrays.asList(
            new News(1, "Swarnava", "Onkar", "Good job. Do budget course"),
            new News(2, "Parth", "Onkar", "Great job Budget"),
            new News(1, "Swarnava", "Onkar", "Keep up the work")
        );
        
        long c = news.stream()
        .filter(n -> n.getComment().toUpperCase().contains("BUDGET")).count();
        
        System.out.println("budget is present in "+c+" news");
        
    }
}
