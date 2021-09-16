public class Main {
    public static void main(String[] args) {
        Persistence p=new FilePersistence();
        System.out.println("Called from "+p.persist());
        System.out.println("============");
        Persistence p1=new DatabasePersistence();
        System.out.println("Called from "+p1.persist());
    }
}
