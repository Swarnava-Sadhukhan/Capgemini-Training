public class Candy extends DessertItem{
    int cost, tax;
    @Override
    int getCost() {
        return (60*cost)+tax;
    }
    
}
