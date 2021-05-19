package genericity;

/**
 * @Description: 泛型方法定义：泛型方法可以不定义在泛型类中
 * @author： see
 * @date： 2021-05-17 9:47 PM
 * @Version:
 */
public class GenericityMethod {
    public <T extends Number> void printValue(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericityMethod method = new GenericityMethod();
        method.printValue(55.5);
    }
}
