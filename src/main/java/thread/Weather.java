package thread;

/**
 * @Description: 天气类
 * @author： see
 * @date： 2021-05-22 3:23 PM
 * @Version:
 */
public class Weather {
    private int temperature;  //温度
    private int humidity;     //湿度
    boolean flag = false;     //温度和湿度是否生成的标志

    public Weather(int temperature,int humidity){
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Weather(){}

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


    /**
    * @Author see
    * @Description //按照传入的温度随机数生成温度和湿度
    * @Date 4:19 PM 2021/5/22
    * @Param [ranTemperature, ranHumidity]
    * @return void
    *
    **/
    public synchronized void generate(int ranTemperature,int ranHumidity){
        //如果当前已经生成温度和湿度数据，则调用wait方法是线程切换到阻塞状态
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int temperature = (int)(Math.random() * ranTemperature);
        setTemperature(temperature);
        int humidity = (int)(Math.random() * ranTemperature);
        setHumidity(humidity);
        System.out.println("生成天气数据[温度：" + temperature + ",湿度：" + humidity + "]");
//        flag = true;   //生成天气数据成功
        notifyAll();   //唤醒所有处于等待中的线程
    }

    /*
    * @Author see
    * @Description //读取天气数据
    * @Date 4:27 PM 2021/5/22
    * @Param []
    * @return void
    *
    **/
    public synchronized void read(){
        //如果当前已经读取天气数据，则调用wait方法使线程进入等待状态
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int temperature = this.getTemperature();
        int humidity = this.getHumidity();
        System.out.println("读取天气数据[温度：" + temperature + ",湿度：" + humidity + "]");
        flag = false;   //消费成功
        notifyAll();    //唤醒所有处于等待状态的线程
    }

    @Override
    public String toString() {
        return "温度：" + temperature +
                ", 湿度：" + humidity +
                '}';
    }
}
