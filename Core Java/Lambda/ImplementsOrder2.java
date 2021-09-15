import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Implementing Supplier,Consumer and Predicate
public class ImplementsOrder2 {
    public static void main(String[] args) {
        //Printing number if even
        operate(()->4,n->n%2==0,System.out::println);

        System.out.println("-------------------------------------------------------------");
        
        //Printing number if odd
        operate(()->5,n->n%2==1,System.out::println);
    }

    private static void operate(Supplier<Integer> s,Predicate<Integer> p,Consumer<Integer> c) {
        if(p.test(s.get()))
            c.accept(s.get());
    }
}


