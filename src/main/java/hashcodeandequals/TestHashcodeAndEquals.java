package hashcodeandequals;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Description: 测试hashcode和equals方法
 * @author： see
 * @date： 2021-05-12 10:38 AM
 * @Version:
 */
public class TestHashcodeAndEquals {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet();
        ArrayList<Student> list = new ArrayList();
        Student stu1 = new Student("张三", 18, "男");
        Student stu2 = new Student("张三", 18, "男");

        //如果此时Student类中重写过hashcode和equals方法，需要先注释掉
        //1、Student类中没有重写equals方法时，equals方法比较的是对象的内存地址，因此stu1和stu2是不同的两个对象，可以添加进set集合中
        //2、只重写equals方法，set的长度=2，list的长度=2，equals=true,hash值不一致
        //3、只重写hashcode方法,set的长度=2，list的长度=2，equals=false
        //4、同时重写hashcode方法和equals方法,et的长度=1，list的长度=2，equals=true,hash值相同
        System.out.println("stu1.equals(stu2): " + stu1.equals(stu2));
        set.add(stu1);
        set.add(stu2);
        System.out.println("set的长度：" + set.size());
        list.add(stu1);
        System.out.println("stu1的hashcode: " + stu1.hashCode());
        list.add(stu2);
        System.out.println("stu2的hashcode: " + stu2.hashCode());
        System.out.println("list的长度：" + list.size());
    }
}
