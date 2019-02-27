package com.yanghao.reflex;

/**
 * @program: Class类的动态加载类
 * @description:
 * @author: yanghao
 * @create: 2018-12-12 15:19
 **/
public class A {
    public static void main(String[] args){
        if("B".equals(args[0])){
            B b=new B();
            b.start();
        }
        if("C".equals(args[0])){
            C c=new C();
            C.start();
        }
    }
}
class B implements Stand{
    public void start(){
    System.out.print("B...satrt");
    }
}
class C{
    public static void start(){
        System.out.print("B...satrt");
    }
}

class All{
    public static void start(String[] args){
        try{
        Class cl= Class.forName(args[0]);
        //通过类类型，创建该类的对象
        Stand s = (Stand) cl.newInstance();
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
interface Stand {
    public void start();
}