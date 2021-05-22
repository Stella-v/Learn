package thread;

/**
 * @Description: 通过实现runnable接口来创建线程
 * @author： see
 * @date： 2021-05-19 4:10 PM
 * @Version:
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "正在运行" + (i+1));
        }
    }
}
