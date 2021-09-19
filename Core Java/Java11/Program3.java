public class Program3 {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy moon";
        String ar[] = s.split(" ",10);
        for(String st:ar)
            System.out.println(st);
    }
}
