public class Labor extends Employee{
    int overtime;
    public Labor(String e_id, String e_name, int basic, int overtime) {
        super(e_id, e_name, basic);
       this.overtime=overtime;
    }
    int totalSalary(){
        return basic+(150*overtime);
    }    
}
