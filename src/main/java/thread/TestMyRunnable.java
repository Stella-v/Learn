package thread;

/**
 * @Description: 测试MyRunnable类
 * @author： see
 * @date： 2021-05-19 4:38 PM
 * @Version:
 */
public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread cat = new Thread(mr);
        Thread dog = new Thread(mr);
        cat.start();
        dog.start();
    }
}
