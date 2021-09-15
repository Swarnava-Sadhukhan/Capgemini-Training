import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter 1 for Simple Interest, 2 for Compound Interest");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the principal amount, rate percent and time(in years)");
                Double p = sc.nextDouble();
                Double r = sc.nextDouble();
                Double t = sc.nextDouble();
                Double si = (p*r*t)/100;
                System.out.println("The Simple interest is "+si);
                break;
            case 2:
                System.out.println("Enter the principal amount, rate percent, no. of times interest calculated in a year and the time(in years)");
                Double principal = sc.nextDouble();
                Double rate = sc.nextDouble();
                int n = sc.nextInt();
                Double time = sc.nextDouble();
                Double ci = principal*Math.pow(1+rate/n,n*time) - principal;
                System.out.println("The Compound interest is "+ci);
                break;
            default:
                System.out.println("Wrong Choice. The program will terminate");
        }
        sc.close();
    }
}
