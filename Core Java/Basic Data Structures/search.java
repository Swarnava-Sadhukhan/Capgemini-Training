import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println("Enter the value to be searched");
        int key = sc.nextInt();
        int flag = 0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==key)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Value is found");
        else
            System.out.println("Value is not found");
        sc.close();
    }
}
