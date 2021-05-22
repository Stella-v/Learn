package thread;

import java.util.concurrent.Callable;

/**
 * @Description: 通过实现callable接口创建线程
 * @author： see
 * @date： 2021-05-22 1:54 PM
 * @Version:
 */
public class MyCallable implements Callable<String> {

    //重写call方法
    @Override
    public String call() throws Exception {
        String str = "线程的第三种创建方法";
        return str;
    }
}
