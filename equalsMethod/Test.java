package cn.duanchangs.equalsMethod;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '1');
        Person person2 = new Person("jack", 10, '1');
        Person person3 = new Person("amy", 10, '0');
        Person person4 = new Person();
        Person person5 = new Person();

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

//        System.out.println(person4.equals(person5)); 空指针异常

        System.out.println(person1.equals(person5));



        System.out.println(person1.toString());

        person1 = null;
        System.gc();

        int[] arr = {1, 2, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("1");

        System.out.println("2");

        System.out.println(person2.toString());
        System.out.println(person2);
    }

}

class Person {
    private String name;
    private int age;
    private char gender;



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁对象");
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person () {

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        //判断传入对象与调用其的对象是同一个对象，返回true
        //即obj.equals(obj)
        if (this == obj) {
            return true;
        }

        if (obj instanceof Person) {//类型判断
            //因为要对比各个对象的各个属性是否相同，所以要向下转型才能得到子类的属性。
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }

        return false;

    }

}
