public class Manager extends Employee{
    int incentive;
    public Manager(String e_id, String e_name, int basic, int incentive) {
        super(e_id, e_name, basic);
        this.incentive=incentive;
    }
    int totalSalary(){
        return basic+incentive;
    }
    
}
