package cn.duanchangs.SmallChange;

import java.util.Scanner;

public class SmallChangeSys {

    //属性
    int key;
    boolean loop = true;
    Scanner s = new Scanner(System.in);
    double balance = 0;//余额
    double money = 0;//入账增加的金额或者消费减少的金额
    String details = "";//账户明细。每一次入账或消费都会生成新的信息拼接入此字符串

    //显示菜单
    public void mainMenu() {
        do {
            System.out.println("\n=======================零钱通菜单=======================");
            System.out.println("1.显示菜单");
            System.out.println("2.入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("请输入1-4");
            key = s.nextInt();

            switch (key) {
                case 1:
                    this.details();
                    break;
                case 2:
                    this.inCome();
                    break;
                case 3:
                    pay();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("输入错误");

            }

        }while (loop);
    }

    //查看零钱通明细
    public void details() {
        System.out.println("------------零钱通明细------------");
        System.out.println(details);
    }

    //入账
    public void inCome() {
        System.out.print("请输入入账金额:");
        money = s.nextDouble();
        balance += money;
        details = details + "收益入账" + money + "\t余额:" + balance + "\n";
    }

    //消费
    public void pay() {
        System.out.print("请输入消费金额:");
        money = s.nextDouble();
        balance -= money;
        details = details + "消费支出" + money + "\t余额:" + balance + "\n";
    }

    //退出
    public void exit() {
        loop = false;
    }


}
