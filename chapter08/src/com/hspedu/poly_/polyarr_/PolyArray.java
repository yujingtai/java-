package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("wjh", 20, 100);
        persons[2] = new Student("ton", 20, 28);
        persons[3] = new Teacher("mary", 20, 29999);
        persons[4] = new Teacher("smith", 20, 28888);

//        for(Person a : persons) {
//            System.out.println(a.say());//内含动态绑定机制
//        }

        for(int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            //那么如何调用子类特有的方法呢(父类中没有子类的特有方法)，这就需要之前讲过的 向下转型
            if (persons[i] instanceof Student) {//instance来判断运行类型
                Student student = (Student) persons[i];//向下转型 强转为Student类型
                student.study();
            }else if(persons[i] instanceof Teacher) {
                //直接简写了
                //强转后直接调用
                ((Teacher) persons[i]).teach();//要把前面整体打上括号
//                Teacher teacher = (Teacher)persons[i];
//                teacher.teach();
            }else {
                System.out.println("你的类型有误");
            }
        }
    }
}
