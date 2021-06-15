package cn.duanchangs.Poly.Polyparameter;

public class test {

    public static void main(String[] args) {
        Common c = new Common("m", 100.0);
        Manager m = new Manager("w", 100.0, 10.0);
        test test = new test();
        test.showEmpAnnal(c);
        test.showEmpAnnal(m);
        test.testWork(c);
        test.testWork(m);
    }

    public void showEmpAnnal (Employee e) {
//        if (e instanceof Common) {
//            System.out.println("员工:" + e.getName() + "的年工资为" + e.getAnnual());
//        }

        //动态绑定机制。传进来的是什么对象就调用什么对象的getAnnual()方法
        System.out.println(e.getAnnual());

    }

    public void testWork(Employee e) {
        if (e instanceof Manager) {
            ((Manager)e).manage(e);
        } else if(e instanceof Common) {
            ((Common)e).work(e);
        }


    }

}
