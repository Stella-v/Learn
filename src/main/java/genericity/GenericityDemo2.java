package genericity;

/**
 * @Description: 多个泛型类限制
 * @author： see
 * @date： 2021-05-17 9:42 PM
 * @Version:
 */
public class GenericityDemo2<X,Y>{
    private X para1;
    private Y para2;

    public GenericityDemo2(X para1, Y para2) {
        this.para1 = para1;
        this.para2 = para2;
    }

    public GenericityDemo2() {
    }

    public X getPara1() {
        return para1;
    }

    public Y getPara2() {
        return para2;
    }

    public void setPara1(X para1) {
        this.para1 = para1;
    }

    public void setPara2(Y para2) {
        this.para2 = para2;
    }

    @Override
    public String toString() {
        return "GenericityDemo2{" +
                "para1=" + para1 +
                ", para2=" + para2 +
                '}';
    }

    public static void main(String[] args) {
        GenericityDemo2<Integer, String> demo2 = new GenericityDemo2<>();
        demo2.setPara1(1);
        demo2.setPara2("jack");
        System.out.println(demo2);
    }
}
