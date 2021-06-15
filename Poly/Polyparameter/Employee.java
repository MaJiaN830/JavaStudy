package cn.duanchangs.Poly.Polyparameter;

public class Employee {

    private String name;
    private double salary;//月工资

    //计算年工资方法
    public double getAnnual() {
        return getSalary() * 12;
    }

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
