package thread;

/**
 * @Description: 通过实现Thread类实现多线程
 * @author： see
 * @date： 2021-05-19 3:55 PM
 * @Version:
 */
public class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + (i+1) + "次" + getName() + "正在运行");
        }
    }
}
