import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CTC");
        int ctc = sc.nextInt();
        double tax;
        if(ctc<=180000)
        {    
            System.out.println("Tax is 0(Nil)");
            sc.close();
            return;
        }
        else if(ctc<=300000)
            tax = (ctc - 180000)*0.1;
        else if(ctc<=500000)
            tax = 120000 * 0.1 + (ctc-300000)*0.2;
        else
            tax = 120000 * 0.1 + 200000*0.2 + (ctc-500000)*0.3;
        System.out.println("Tax is "+tax);
        sc.close();
    }
}
