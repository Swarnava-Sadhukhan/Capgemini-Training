import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        List<News> news = Arrays.asList(
            new News(1, "Swarnava", "Onkar", "Good job"),
            new News(2, "Parth", "Onkar", "Great job"),
            new News(1, "Swarnava", "Ayush", "Keep up the work")
        );
        
        Map<String,List<News>> newsMap = news.stream()
        .collect(Collectors.groupingBy(News::getCommentByUser));
        
        //System.out.println(newsMap);

        for(String s:newsMap.keySet())
        {
            System.out.println("User - "+s+" has commented on "+newsMap.get(s).size()+" posts");
        }
        
    }
}
