package innerclass;

//外部类
public class MemberInnerClass {

    public int age = 3;
    //提供获取内部类的方法
    public Member getMember(){
        return new Member();
    }

    public void test(){
        System.out.println("外部类的test方法");
    }

    //成员内部类
    class Member {
        int age = 5;
        public String beat(){
            return "心脏在跳动,age=" + MemberInnerClass.this.age ;
        }

        public void test(){
            System.out.println("内部类的test方法");
        }

    }

}
