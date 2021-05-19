package collection;

import collection.sort.PersonComperator;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Description: treeset学习
 * @author： see
 * @date： 2021-05-17 8:02 PM
 * @Version:
 */
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Person> treeset = new TreeSet<Person>(new PersonComperator());
        Person person1 = new Person(10, "zhangsan", 20);
        Person person2 = new Person(1, "lisi", 18);
        Person person3 = new Person(4, "wangwu", 29);
        Person person4 = new Person(2, "zhaoliu", 9);
        Person person5 = new Person(15, "wangqi", 10);
        Person person6 = new Person(99, "zhangsi", 2);

        treeset.add(person1);
        treeset.add(person2);
        treeset.add(person3);
        treeset.add(person4);
        treeset.add(person5);
        treeset.add(person6);

//        System.out.println("展示集合所有元素：" );
//        for (Person p : treeset) {
//            System.out.println(p);
//        }

        TreeSet<Integer> intSet = new TreeSet<Integer>();
        intSet.add(3);
        intSet.add(-1);
        intSet.add(18);
        intSet.add(9);
        intSet.add(0);
        //返回set中小于给定数字的最大数字，没有就返回null
        System.out.println("输入等于3的数字：" + intSet.floor(3));  //3
        System.out.println("输入小于2的数字：" + intSet.floor(2));  //0
        System.out.println("输入小于-2的数字：" + intSet.floor(-2)); //null

        //返回set中大于给定数字的最小数字，没有就返回null
        System.out.println("输入大于3的数字：" + intSet.higher(3));  //9  注意，与floor不一样
        System.out.println("输入大于2的数字：" + intSet.higher(4));  //9
        System.out.println("输入大于2的数字：" + intSet.higher(20)); //null

        //返回set中排序最小的
        System.out.println("intSet中的最小的元素为：" + intSet.first());  //默认升序
        System.out.println("treeset中的最小的元素为：" + treeset.first()); //按年龄排序

        //返回set中排序最大的
        System.out.println("intSet中的最大的元素为：" + intSet.last());  //默认升序
        System.out.println("treeset中的最大的元素为：" + treeset.last()); //按年龄排序

        //检索并删除第一个元素
        System.out.println("检索并删除intset中的第一个元素：" + intSet.pollFirst());
        for (Integer num : intSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        //检索并删除第一个元素
        System.out.println("检索并删除intset中的最后一个元素：" + intSet.pollLast());
        for (Integer num : intSet) {
            System.out.print(num + " ");
        }



    }
}
