package com.yanghao.classloader;

import java.io.*;

/**
 * @program: classdemo
 * @description:自定义classloader
 * @author: yanghao
 * @create: 2019-02-22 16:07
 **/
public class MyClassLoader extends ClassLoader{
    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    //用于寻找类文件
    @Override
    public Class<?> findClass(String name){
        byte[] b = loadclassData(name);
        return defineClass(name,b,0,b.length);//将类加载进内存
    }

    //用于加载类文件
    private byte[] loadclassData(String name) {
        name = path + name +".class";
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            inputStream = new FileInputStream(new File(name));
            byteArrayOutputStream = new ByteArrayOutputStream();
            int i =0;
            while ((i = inputStream.read())!=-1){
                byteArrayOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
