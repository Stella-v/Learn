package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description: set的注意事项
 * @author： see
 * @date： 2021-05-12 2:38 PM
 * @Version:
 */
public class TestHashset {
    public static void main(String[] args) {
        //1、set无法添加重复的内容
        Cat cat = new Cat("圆圆", 4);
        Cat cat2 = new Cat("圆圆", 5);
        Cat cat3 = new Cat("团团", 6);
        Cat cat4 = new Cat("滚滚", 7);
        Set<Cat> set = new HashSet<Cat>();
        set.add(cat);
        set.add(cat2);

        //遍历set
        System.out.println("************************遍历数据**********************");
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //2、set在遍历的过程中不能删除数据,运行时报错ConcurrentModificationException
        set.add(cat3);
        set.add(cat4);
        System.out.println("*******************遍历数据过程中删除数据");
        Set<Cat> removeSet = new HashSet<Cat>();
        for (Cat cats : set) {
            if(cats.getAge() < 7){
//                set.remove(cats);
                removeSet.add(cats);

            }
        }

        set.removeAll(removeSet);
        System.out.println("********************删除数据后遍历数据***************");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
