package cn.duanchangs.equalsMethod;

public class CodeBlock {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    static {
        System.out.println("A的jingta0." +
                "代码块");
    }
}

class B extends A{

}