package cn.duanchangs.abstract_;

public class abstract02 {

}

abstract class B {
    public abstract void study();
    public abstract void study2();
    //普通属性
    private int a;
    //静态属性
    public static int b;
    //静态方法
    public static void sleep () {

    }
    //普通方法
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    //构造器
    public B() {

    }
}

