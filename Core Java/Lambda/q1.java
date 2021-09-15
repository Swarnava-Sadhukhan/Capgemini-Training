
//Operations using lambda functions
public class q1 {
    public static void main(String[] args) {
        double a=10.0,b=5.0;
        
        operate(a, b, (c,d)->c+d);
        operate(a, b, (c,d)->c-d);
        operate(a, b, (c,d)->c*d);
        operate(a, b, (c,d)->c/d);
    }

    public static void operate(double a,double b,Operation o){
        System.out.println(o.compute(a, b));
    }
}

interface Operation{
    double compute(double a,double b);
}
