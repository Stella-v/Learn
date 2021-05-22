package thread;

/**
 * @Description: 测试MyThread类
 * @author： see
 * @date： 2021-05-19 3:58 PM
 * @Version:
 */
public class TestMythread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");
        thread1.start();
        thread2.start();

    }
}
