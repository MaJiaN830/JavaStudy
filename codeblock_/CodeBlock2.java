package cn.duanchangs.codeblock_;

public class CodeBlock2 {
    public static void main(String[] args) {
        AA A = new AA();
        A.getVB();
    }
}

class AA {
    static {
        System.out.println("静态代码块");
    }

    private static int a = getV();

    private int b = getVB();

    {
        System.out.println("普通代码块");
    }

    public static int getV() {
        System.out.println("静态方法getV");
        return 10;
    }

    public int getVB() {
        System.out.println("普通方法getVB");
        return 200;
    }

    public AA() {
        System.out.println("构造器");
    }

}
