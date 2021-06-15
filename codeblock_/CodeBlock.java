package cn.duanchangs.codeblock_;

public class CodeBlock {
    public static void main(String[] args) {
        new B();
        new B();

    }
}

class A {
    {
        System.out.println("A的普通代码块");
    }

    static {
        System.out.println("A的静态代码块");
    }
}

class B extends A {
    {
        System.out.println("B的普通代码块");
    }

    static {
        System.out.println("B的静态代码块");
    }
}
