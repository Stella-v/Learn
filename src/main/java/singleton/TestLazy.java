package singleton;

public class TestLazy {
    public static void main(String[] args) {
        LazySingleton lazy = LazySingleton.getLazyInstance();
        LazySingleton lazy2 = LazySingleton.getLazyInstance();
        System.out.println(lazy);
        System.out.println(lazy2);
    }
}
