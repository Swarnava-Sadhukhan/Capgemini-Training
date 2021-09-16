public class Main {
    public static void main(String[] args) {
        Employee e=new Employee("E101", "Manoj", 25000);
        System.out.println("Employee ID: "+e.e_id);
        System.out.println("Employee Name: "+e.e_name);
        System.out.println("Employee Salary: "+e.totalSalary());

        System.out.println("=========================================");
        
        Manager m=new Manager("E1001", "Thangaraj", 65000, 10000);
        System.out.println("Manager ID: "+m.e_id);
        System.out.println("Manager Name: "+m.e_name);
        System.out.println("Manager Salary: "+m.totalSalary());

        System.out.println("=========================================");

        Labor l=new Labor("E5001", "Swanand", 10000, 4);
        System.out.println("Labor ID: "+l.e_id);
        System.out.println("Labor Name: "+l.e_name);
        System.out.println("Labor Salary: "+l.totalSalary());
    }
}
