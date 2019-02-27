package com.yanghao.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @program:
 * @description:
 * @author: yanghao
 * @create: 2018-12-12 15:15
 **/
public class ClassUtil {

//    3、成员变量的反射
    public static void printFieldMessage(Object obj){
        Class c = obj.getClass();
        Field[] fs = c.getFields();
        for (Field field : fs) {
//得到成员变量的类型的类类型
            Class fieldType = field.getType();
            String typeName = fieldType.getName();
//得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName+" "+fieldName);
        }
    }
//    4、构造函数的反射
    public static void printConMessage(Object obj){
        Class c = obj.getClass();
        /*
         * 首先构造函数也是对象，是java.lang.Constructor类的对象
         * 也就是java.lang. Constructor中封装了构造函数的信息
         * 和前面说到的一样，它也有两个方法：
         * getConstructors()方法获取所有的public的构造函数
         * getDeclaredConstructors()方法得到所有的自己声明的构造函数
         */
//Constructor[] cs = c.getConstructors();
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
//我们知道构造方法是没有返回值类型的，但是我们可以：
            System.out.print(constructor.getName()+"(");
//获取构造函数的参数列表》》得到的是参数列表的类类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName()+",");
            }
            System.out.println(")");
        }
    }
}
