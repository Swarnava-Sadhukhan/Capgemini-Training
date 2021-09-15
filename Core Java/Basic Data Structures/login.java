import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login_id = "sadhu.man11@gmail.com", password = "1234";
        int count = 0;
        while(count<3)
        {
            System.out.println("Enter the login id");
            String name = sc.nextLine();
            System.out.println("Enter the password");
            String pass = sc.nextLine();
            if(login_id.equals(name) && password.equals(pass))
            {
                System.out.println("Welcome,"+login_id);
                sc.close();
                return;
            }
            count++;
            System.out.println("Invalid credentials");
        }
        System.out.println("Contact Admin");
        sc.close();
    }
}
