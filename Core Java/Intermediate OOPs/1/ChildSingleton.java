public class ChildSingleton extends ParentSingleton {

    private static ChildSingleton instance;

    public static ParentSingleton getInstance() {
       if (instance == null) {
          instance = new ChildSingleton();
       }

       return instance;
    }
    public static void main(String[] args) {
        ChildSingleton cs = new ChildSingleton();
        getInstance();

    }       
}