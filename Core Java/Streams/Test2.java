import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
            new Fruit("Apple", "Red", 70, 20),
            new Fruit("Mango", "Yellow", 50, 50),
            new Fruit("Banana", "Yellow", 90, 10),
            new Fruit("Watermelon", "Green", 180, 60)
        );
        Map<String,List<Fruit>> fruitMap= fruits.stream()
        .collect(Collectors.groupingBy(Fruit::getColor));       //Group the fruits

        for(String s:fruitMap.keySet())                 //Print the fruits by color
        {
            System.out.println("Color --- "+s);
            List<Fruit> f = fruitMap.get(s);
            for(Fruit fr:f)
                System.out.println(fr);
        }
        
    }
}
