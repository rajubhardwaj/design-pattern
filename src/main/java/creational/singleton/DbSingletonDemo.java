package creational.singleton;

import creational.singleton.DbSingleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        System.out.println(instance);
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);
    }
}
