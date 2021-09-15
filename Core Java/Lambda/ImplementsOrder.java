import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Filtering Orders using Lambda functions
public class ImplementsOrder {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order(15000,"ACCEPTED"),
            new Order(8000, "COMPLETED"),
            new Order(25000,"COMPLETED"),
            new Order(6000, "ACCEPTED")
        );

        //Printing orders with price>10000
        operate(orders, o -> o.getPrice()>10000,System.out::println);

        System.out.println("-------------------------------------------------------------");

        //Printing orders with status accepted
        operate(orders, o -> o.getStatus().equals("ACCEPTED"),System.out::println);
    }

    private static void operate(List<Order> orders,Predicate<Order> p,Consumer<Order> c) {
        for(Order o:orders)
        {
            if(p.test(o))
                c.accept(o);
        }
    }
}


