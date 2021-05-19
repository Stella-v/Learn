package collection;


/**
 * @Description:
 * @author： see
 * @date： 2021-05-12 2:36 PM
 * @Version:
 */
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());;
        return result;
    }

    //实现comparable接口中CompareTo方法,按名称升序排序
    public int compareTo(Cat o) {
        String name1 = this.getName();
        String name2 = o.getName();
        int num = name1.compareTo(name2);
        return num;
    }


}
