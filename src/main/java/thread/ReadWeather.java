package thread;

/**
 * @Description: 读取天气数据
 * @author： see
 * @date： 2021-05-22 4:46 PM
 * @Version:
 */
public class ReadWeather implements Runnable{
    Weather weather;
    public ReadWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            weather.read();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
