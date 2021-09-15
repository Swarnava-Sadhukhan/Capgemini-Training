import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n = sc.nextInt();
	    int temp = n, r=0, d;
	    while(temp!=0)
	    {
	        d = temp%10;
	        r += d*d*d;
	        temp /= 10;
	    }
	    if(n==r)
     		System.out.println(n+" is an Armstrong number");
     	else
     	    System.out.println(n+" is not an Armstrong number"); 
		sc.close();
	}
}