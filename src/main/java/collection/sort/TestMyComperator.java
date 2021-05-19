package collection.sort;

import collection.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: comperator测试类
 * @author： see
 * @date： 2021-05-17 5:10 PM
 * @Version:
 */
public class TestMyComperator {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<Cat>();
        Cat cat1 = new Cat("maomao",3);
        Cat cat2 = new Cat("huahua",5);
        Cat cat3 = new Cat("yuanyuan",1);
        Cat cat4 = new Cat("tuantuan",7);

        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);

        System.out.println("按年龄升序排序前：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }

        //排序
        Collections.sort(catList,new MyComperator());
        System.out.println("按年龄升序排序后：");
        for (Cat cat : catList) {
            System.out.println(cat);
        }
    }

}
