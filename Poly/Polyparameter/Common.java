package cn.duanchangs.Poly.Polyparameter;

public class Common extends Employee{

    public void work (Employee c) {
        System.out.println("员工:" + c.getName() + "在工作");
    }

    public Common(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
