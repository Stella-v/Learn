package collection.sort;

import collection.Cat;

import java.util.Comparator;

/**
 * @Description: 自定义comperator类
 * @author： see
 * @date： 2021-05-17 5:04 PM
 * @Version:
 */
public class MyComperator implements Comparator<Cat> {
    //按年龄升序对猫进行排序,age1 > age2 返回负数； age1 = age2 返回0； age1 < age2 返回正数
    public int compare(Cat o1, Cat o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        return age1 - age2;
    }

}
