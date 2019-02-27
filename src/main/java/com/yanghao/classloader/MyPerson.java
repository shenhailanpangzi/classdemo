package com.yanghao.classloader;

/**
 * @program: classdemo
 * @description:
 * @author: yanghao
 * @create: 2019-02-22 14:42
 **/
public class MyPerson {
    private String name;

    public void say(String word){
        System.out.println(word);

    }
    private String sayhello(String word){

        return this.name+"说了"+word;
    }
}
