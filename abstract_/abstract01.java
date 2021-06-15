package cn.duanchangs.abstract_;

public class abstract01 {

}
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //我们可以将该方法设计为抽象方法
    //所谓抽象方法就是没有实现的方法，也即没有方法体的方法
    //而当一个类中存在抽象方法时，则该类必须为抽象类
    public abstract void eat();

//    public abstract int a = 1;

}