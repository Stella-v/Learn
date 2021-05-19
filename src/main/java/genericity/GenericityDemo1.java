package genericity;

/**
 * @Description: 一个参数的泛型类自定义
 * @author： see
 * @date： 2021-05-17 9:33 PM
 * @Version:
 */
//public class GenericityDemo1<Tr>{
public class GenericityDemo1<T extends Number>{
    private T num;

    public GenericityDemo1() {
    }

    public GenericityDemo1(T num) {
        this.num = num;
    }

    public T getNum(){
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args) {
        GenericityDemo1<Integer> intDemo = new GenericityDemo1<>();
        intDemo.setNum(50);
        System.out.println("integer类型：" + intDemo.getNum());

//        GenericityDemo1<String> string = new GenericityDemo1<>();
//        string.setNum("测试99");
//        System.out.println("Stirng类型：" + string.getNum());

        GenericityDemo1<Double> doubleDemo = new GenericityDemo1<>();
        doubleDemo.setNum(23.0);
        System.out.println(doubleDemo.getNum());

    }
}
