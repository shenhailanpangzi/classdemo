package com.yanghao.jvm;

/**
 * @program: classdemo
 * @description:
 * @author: yanghao
 * @create: 2018-11-16 09:41
 **/
//元数据 metainfo 在方法区存类信息（对一个类的描述）
//mysql ====>
public class Apptest {

    public static void main(String[] args) {
        //实例化对象存放在堆中
        Person person = new Person("张三");
        person.sayhello();

        //热点代码  把字节码===> 机器执行码  加快程序执行速度
        for (int i = 0; i < 5000; i++) {
            person.sayhello();
        }
    }
}

class Person {
    String name = new String("1234");

    public Person(String name) {
        this.name = name;
    }

    public void sayhello() {
        System.out.println("hello" + name);
    }
}
