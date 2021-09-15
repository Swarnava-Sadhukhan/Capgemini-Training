public class AllArmstrong
{
	public static void main(String[] args) {
	    for(int n=100;n<1000;n++){
			int temp = n, r=0, d;
			while(temp!=0)
			{
				d = temp%10;
				r += d*d*d;
				temp /= 10;
			}
			if(n==r)
				System.out.println(n+" is an Armstrong number");
		}
	}
}