package innerclass;

public class TestMemberInnerClass {
    public static void main(String[] args) {
        //①外部类.内部类 内部类名称 = new 外部类().new 内部类（）；
        MemberInnerClass.Member innerMember = new MemberInnerClass().new Member();
        System.out.println(innerMember.beat());
        System.out.println("===============================");

        //② 第一步：创建外部类对象  第二步：外部类.内部类 内部类名称 = 外部类对象.new 内部类();
        MemberInnerClass outerMember = new MemberInnerClass();
        MemberInnerClass.Member innerMember2 = outerMember.new Member();
        System.out.println(innerMember2.beat());
        outerMember.test();
        System.out.println("===============================");

        //③第一步：创建外部类对象  第二步：外部类.内部类 内部类名称 = 外部类对象.获取内部类对象的方法;
        MemberInnerClass.Member innerMember3 = outerMember.getMember();
        System.out.println(innerMember3.beat());
        innerMember3.test();
    }
}
