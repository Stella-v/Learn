package collection.sort;

import collection.Person;

import java.util.Comparator;

/**
 * @Description: Treeset比较器
 * @author： see
 * @date： 2021-05-17 8:20 PM
 * @Version:
 */
public class PersonComperator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        return age1 -age2;
    }
}
