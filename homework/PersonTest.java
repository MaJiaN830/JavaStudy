package cn.duanchangs.homework;

public class PersonTest {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        p[0] = new Person("Jim", "worker", 18);
        p[1] = new Person("Amy", "teacher", 30);
        p[2] = new Person("Bob", "boss", 40);

        Person tmp = null;

        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[i].getAge() < p[i+1].getAge()) {
                    tmp = p[i];
                    p[i] = p[i+1];
                    p[i+1] = tmp;
                }
            }
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }
}

class Person {
    private String name;
    private String job;
    private int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
