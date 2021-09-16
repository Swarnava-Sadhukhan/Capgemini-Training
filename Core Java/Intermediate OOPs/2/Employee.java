public class Employee{
    String e_id;
    String e_name;
    int basic;
    public Employee(String e_id, String e_name, int basic){
        this.e_id=e_id;
        this.e_name=e_name;
        this.basic=basic;
    }

    int totalSalary(){
        return basic;
    }
}