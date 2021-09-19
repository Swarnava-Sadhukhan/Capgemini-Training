public class Program1{
    public static void main(String[] args) {
        SI si = (p,r,t)->p*r*t/100;
        System.out.println(si.calc(1000,10,1));
    }
}

interface SI{
    int calc(int principal,int rate,int time);
}