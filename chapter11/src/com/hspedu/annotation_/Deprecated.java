package com.hspedu.annotation_;

/**
 * @author 吴金辉
 * @version 1.0
 */
public class Deprecated {
    public static void main(String[] args) {
        A a = new A();
        int n = a.n1;
        a.hi();
    }
}


//@Deprecate 修饰某个元素，表示该元素已经过时
//即不在推荐使用，但是仍然可以使用
//可以修饰方法、类、字段、包、参数、等等
//作用：可以用于版本的兼容过度
@java.lang.Deprecated
class A {
    @java.lang.Deprecated
    public int n1 = 10;
    @java.lang.Deprecated
    public void hi() {}
}