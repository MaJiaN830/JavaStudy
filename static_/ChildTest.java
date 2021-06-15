package cn.duanchangs.static_;

public class ChildTest {
    public static void main(String[] args) {
        System.out.println(Child.count);

        Child child01 = new Child("a");
        Child child02 = new Child("b");
        Child child03 = new Child("C");

        child01.a();

    }
}

class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
        System.out.println("111");
    }

    {
        System.out.println("代码块调用");
    };

    public static void a() {
        System.out.println(Child.count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void countChildren() {

    }


}
