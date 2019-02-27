package com.yanghao.jvm;

/**
 * @program: classdemo
 * @description: 递归
 * @author: yanghao
 * @create: 2018-11-16 10:09
 **/
public class Recursive {
    private Long i=0L;

    public void test(int a,double b){
        i++;
        System.out.println("======>"+i);
        test(a,b);
    }

    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        recursive.test(0,0.0d);
    }
}
