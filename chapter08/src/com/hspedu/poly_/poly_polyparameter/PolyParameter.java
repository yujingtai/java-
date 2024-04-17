package com.hspedu.poly_.poly_polyparameter;

public class PolyParameter {//测试类
    public static void main(String[] args) {
        //创建对象数组
        Empolyee[] e = new Empolyee[2];
        e[0] = new Worker("wjh",6000);
        e[1] = new Manager("wjt", 10000, 100000);

        //调用本类的方法
        //首先创建对象
        PolyParameter polyParameter = new PolyParameter();
        for(Empolyee ee : e) {
            System.out.println(ee.getName() + "的工资是" + polyParameter.showEmpAnnual(ee));
            polyParameter.testWork(ee);

        }

    }

    //获取任何员工对象的年工资
    public double showEmpAnnual(Empolyee e) {//参数中包括了向上转型
        return e.getAnnual();//包括了动态绑定机制
    }

    //区别对待方法
    public void testWork(Empolyee e) {
        if(e instanceof Manager) {//向下转型的首要条件是 转型的对象 运行类型 必须是即将要转型的对象
            ((Manager) e).manage();//强转后就可以调用子类的特有方法
        }else if(e instanceof Worker) {
            ((Worker) e).work();
        }
    }
}
