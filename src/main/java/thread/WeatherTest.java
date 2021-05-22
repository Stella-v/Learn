package thread;

/**
 * @Description: 测试天气数据生成和读取
 * @author： see
 * @date： 2021-05-22 4:48 PM
 * @Version:
 */
public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        new Thread(new GenerateWeather(weather)).start();
        new Thread(new ReadWeather(weather)).start();
    }
}
