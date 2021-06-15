package cn.duanchangs.Poly.PolyArray;

public class Person {

    private String name;
    private int age;

    public String say() {
        System.out.println("say");
        return "say";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
