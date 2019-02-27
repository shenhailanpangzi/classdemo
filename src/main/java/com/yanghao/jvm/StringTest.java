package com.yanghao.jvm;

/**
 * @program: classdemo
 * @description:
 * @author: yanghao
 * @create: 2018-11-16 10:35
 **/
public class StringTest {
    public static void main(String[] args) {
        //问：这里共生成了多少个对象，JVM字符串折叠
        String s = "1"+"2"+"3";
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s);
        System.out.println(s1 == s2);//比较地址 s1 的地址指向堆，s2地址指向常量池
        System.out.println(s1.equals(s2));//因为String重写了equals方法，所以比较String内容
    }
}
