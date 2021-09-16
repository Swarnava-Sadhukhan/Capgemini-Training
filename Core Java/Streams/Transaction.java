public class Transaction {
    private Trader trader;
    private int year,value;
    public String getTraderCity()
    {
        return trader.getCity();
    }
    public Trader getTrader() {
        return trader;
    }
    public void setTrader(Trader trader) {
        this.trader = trader;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Transaction [trader=" + trader + ", value=" + value + ", year=" + year + "]";
    }
    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    
}
