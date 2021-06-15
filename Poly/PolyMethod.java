package cn.duanchangs.Poly;

public class PolyMethod {

    public static void main(String[] args) {
        //向上转型
        Animal animal = new Cat();
        //向下转型
        Cat cat = (Cat) animal;

        Animal animal1 = new Cat();
        System.out.println(animal1 instanceof Object);

        Object obj = "s";
        System.out.println(obj);

    }

}
