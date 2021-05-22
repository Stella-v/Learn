package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @Description: 测试实现callable接口创建线程
 * @author： see
 * @date： 2021-05-22 1:57 PM
 * @Version:
 */
public class TestMyCallable {
    public static void main(String[] args) {
        MyCallable callable = new MyCallable();
        FutureTask<String> task = new FutureTask<String>(callable);
        Thread thread = new Thread(task);
        //启动线程
        thread.start();

        //获取call方法的返回值
        try {
            String str =  task.get();
            System.out.println(str);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
