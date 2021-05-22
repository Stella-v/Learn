package thread;

/**
 * @Description: 温度生成
 * @author： see
 * @date： 2021-05-22 4:31 PM
 * @Version:
 */
public class GenerateWeather implements Runnable{
    Weather weather;
    public GenerateWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            weather.generate(40,100);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
