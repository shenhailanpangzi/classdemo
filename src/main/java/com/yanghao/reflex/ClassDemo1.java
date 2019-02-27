package com.yanghao.reflex;

/**
 * @Description：1、类的反射什么是Class类
 * @Author:yanghao
 * @Date：2018/3/13 10:24
 */
public class ClassDemo1 {
    public static void main(String[] args) {

//        实例化对象有三种表示方法 三种表达方式，Foo类的类类型，也就是官方解释的Class Type。
        //创建foo1的实例对象
        Foo foo1 = new Foo();
        //任何一个类都是Class类的实例对象，有三种表示形式
        //第一种表示方式：实际在告诉我们任何一个类都有一个隐含的静态成员变量Class
        Class c1 = Foo.class;
        //第二种表示：通过对象的.getClass方法
        Class c2 = foo1.getClass();
        //类也是个对象，官网表示c1，c2表示了Foo类的类类型（class type）
        //第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("com.yanghao");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //我们可以通过该类的类类型，创建该类的实例对象
        try {
            Foo foo = (Foo) c1.newInstance();
            foo.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
class Foo{
    void print(){

    }
}

