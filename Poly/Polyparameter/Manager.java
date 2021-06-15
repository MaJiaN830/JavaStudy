package cn.duanchangs.Poly.Polyparameter;

public class Manager extends Employee{
    private double bonus; //奖金

        public void manage(Employee m) {
        System.out.println("经理:" + m.getName() + "在管理");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
