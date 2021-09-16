import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test1{

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
            new Fruit("Apple", "Red", 70, 20),
            new Fruit("Mango", "Yellow", 50, 50),
            new Fruit("Banana", "Yellow", 90, 10),
            new Fruit("Watermelon", "Green", 180, 60)
        );
        fruits.stream()
        .filter(f -> (f.getCalories()<100))                                 //Filtering less than 100
        .sorted(Comparator.comparing(Fruit::getCalories).reversed())        //Sorting in descending order
        .forEach(System.out::println);                                      //Print fruits
    }
}
