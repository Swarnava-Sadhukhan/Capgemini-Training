import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the 3 subjects");
        int marks[] = new int[3];
        int c = 0; 
        for(int i=0;i<3;i++)
        {
            marks[i] = sc.nextInt();
            if(marks[i]>60)
                c++;
        }
        if(c==3)
            System.out.println("Passed");
        else if(c==2)
            System.out.println("Promoted");
        else
            System.out.println("Failed");
        sc.close();
    }
}
