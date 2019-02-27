package com.yanghao.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program: classdemo
 * @description:
 * @author: yanghao
 * @create: 2019-02-22 16:22
 **/
public class ClassCheck {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        MyClassLoader m = new MyClassLoader("F:/spring boot/classdemo/src/main/java/com/yanghao/classloader/","MyPerson");
        Class ps = m.loadClass("MyPerson");
        Object o = ps.newInstance();
        Method method = ps.getDeclaredMethod("sayhello",String.class);
        String bobo = (String) method.invoke(o, "bobo");
        System.out.println(bobo);
    }
}
