import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test3{

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
            new Fruit("Strawberry", "Red", 40, 100),
            new Fruit("Mango", "Yellow", 50, 50),
            new Fruit("Banana", "Yellow", 90, 10),
            new Fruit("Watermelon", "Green", 180, 60),
            new Fruit("Apple", "Red", 70, 20)
        );
        fruits.stream()
        .filter(f -> (f.getColor().equals("Red")))                                 //Filtering less than 100
        .sorted(Comparator.comparing(Fruit::getPrice))        //Sorting in descending order
        .forEach(System.out::println);                                      //Print fruits
    }
}
