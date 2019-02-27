package com.yanghao.classloader;

/**
 * @program: classdemo
 * @description:
 * @author: yanghao
 * @create: 2018-11-16 08:42
 **/
public class Test {

    public static void main(String[] args) {
        ClassLoader classLoader = Test.class.getClassLoader();
        //类加载检查顺序：自底而上   加载顺序：自顶向下
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
