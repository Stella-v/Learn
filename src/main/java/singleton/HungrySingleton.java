package singleton;

public class HungrySingleton {
    //私有的构造方法
    private HungrySingleton(){ }

    //私有的静态的类的实例
    private static HungrySingleton instance = new HungrySingleton();

    //公有静态方法返回类的静态实例
    public static HungrySingleton getInstance(){
        return instance;
    }

}
