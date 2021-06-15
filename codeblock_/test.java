package cn.duanchangs.codeblock_;

public class test {
    public static void main(String[] args) {
        System.out.println(AAA.num); //输出1000而不会输出静态代码块后再输出1000
    }
}

class AAA {
    public static final int num = 1000;
    static {
        System.out.println("静态代码块执行");
    }
}
