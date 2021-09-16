public class ParentSingleton {

    private static ParentSingleton instance;

    private ParentSingleton() {
    }

    public static ParentSingleton getInstance() {
       if (instance == null) {
          instance = new ParentSingleton();
       }
       return instance;
    }
    
}

