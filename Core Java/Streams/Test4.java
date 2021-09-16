import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<News> news = Arrays.asList(
            new News(1, "Swarnava", "Onkar", "Good job"),
            new News(2, "Parth", "Onkar", "Great job"),
            new News(1, "Swarnava", "Onkar", "Keep up the work")
        );
        
        Map<Integer,List<News>> newsMap = news.stream()
        .collect(Collectors.groupingBy(News::getNewsId));
        
        System.out.println(newsMap);
        int id = 0, max_com = 0;
        for(Integer n:newsMap.keySet())
        {
            if(newsMap.get(n).size()>max_com)
            {
                max_com = newsMap.get(n).size();
                id = n;
            }
        }
        System.out.println("NewsId - "+id+" has "+max_com+" comments");
        
        


        // int m = news.stream().max(Comparator.comparing(News::get))
    }
}
