package singleton;

public class TestHungry {

    public static void main(String[] args) {

        HungrySingleton hungry = HungrySingleton.getInstance();
        HungrySingleton hungry2 = HungrySingleton.getInstance();
        System.out.println(hungry);
        System.out.println(hungry2);

    }
}
