package singleton;

public class LazySingleton {
    //私有的构造方法
    private LazySingleton(){
    }

    //私有的静态的类的实例
    private static LazySingleton lazyInstance = null;

    //静态的公有的方法提供实例对象：需要时才创建
    public static LazySingleton getLazyInstance(){
        if(lazyInstance == null){
            lazyInstance = new LazySingleton();
        }
        return lazyInstance;
    }

}
