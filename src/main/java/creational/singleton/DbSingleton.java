package creational.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;

    private DbSingleton(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() to create an object");
        }
    }

    public static DbSingleton getInstance() {
        //lazy loading
        if(instance == null){
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
