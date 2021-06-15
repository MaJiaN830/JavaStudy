package cn.duanchangs.codeblock_;

public class FinalExercise {
    public static void main(String[] args) {
        System.out.println(Circle.mianji(5));
    }
}

class Circle {
    private double radius;//半径
    private static final double PI = 3.14;

    public static double mianji(double radius) {
        return PI * radius * radius;
    }



}