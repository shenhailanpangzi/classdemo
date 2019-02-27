package com.yanghao.reflex.person;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: classdemo
 * @description:
 * @author: yanghao
 * @create: 2019-02-22 14:46
 **/
public class Reflexsample {
    public static void main(String[] args) throws Exception {
        Class pc = Class.forName("com.yanghao.reflex.person.Person");
        Person person = (Person) pc.newInstance();//通过反射创建对象
        System.out.println("Class name is:"+ pc.getName());
        Method refsay = pc.getDeclaredMethod("sayhello", String.class);//可以获得所有声明的方法
        refsay.setAccessible(true);//调用private方法需要设置为true
        Object str = refsay.invoke(person, "Bob");
        System.out.println("sayhello返回："+str);
        Method refsayhello = pc.getMethod("say",String.class);//获得公共的和继承来的方法 和实现的接口方法
        refsayhello.invoke(person,"world!");
        Field name = pc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"Alice");
        Object str1= refsay.invoke(person, "Bob");
        System.out.println("sayhello返回:"+str1);
        System.out.println("");
        System.out.println("");
    }
}
