import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        for(int i=1;i<4;i++)
        {
            System.out.println("Enter the marks of the 3 subjects of Student "+i);
            a[i-1] = sc.nextInt();
            b[i-1] = sc.nextInt();
            c[i-1] = sc.nextInt();
        }
        a[3] = a[0]+a[1]+a[2];
        b[3] = b[0]+b[1]+b[2];
        c[3] = c[0]+c[1]+c[2];
        a[4] = a[3]/3;
        b[4] = b[3]/3;
        c[4] = c[3]/3;
        System.out.println("The total for each subject is "+a[3]+", "+b[3]+", "+c[3]);
        System.out.println("The averages for each subject is "+a[4]+", "+b[4]+", "+c[4]);
        sc.close();
    }
}
