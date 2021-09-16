import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {
        List<News> news = Arrays.asList(
            new News(1, "Swarnava", "Onkar", "Good job"),
            new News(2, "Parth", "Onkar", "Great job"),
            new News(1, "Swarnava", "Onkar", "Keep up the work")
        );
        
        Map<String,List<News>> newsMap = news.stream()
        .collect(Collectors.groupingBy(News::getCommentByUser));
        
        //System.out.println(newsMap);
        int max_com = 0; String user = "";
        for(String s:newsMap.keySet())
        {
            if(newsMap.get(s).size()>max_com)
            {
                max_com = newsMap.get(s).size();
                user = s;
            }
        }
        System.out.println("User - "+user+" has "+max_com+" comments");
        
        


        // int m = news.stream().max(Comparator.comparing(News::get))
    }
}
