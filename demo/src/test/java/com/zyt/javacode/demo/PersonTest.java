package com.zyt.javacode.demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import com.zyt.javacode.demo.utils.Person;

public class PersonTest {
    public static void main(String[] args) throws Exception{
        //获取Class对象
        Class clazz = Class.forName("com.zyt.javacode.demo.utils.Person");

        //获取字段
        System.out.println("获取所有字段");
        Field[] fieldArray = clazz.getDeclaredFields();
        for (Field field : fieldArray) {
            System.out.println(field);
        }

        System.out.println("获取所有共有字段");
        fieldArray = clazz.getFields();
        for (Field field : fieldArray) {
            System.out.println(field);
        }

        System.out.println("获取所有共有字段并调用");
        Field f = clazz.getField("name");
        System.out.println(f);

        //获取Person对象
        Object per = clazz.getConstructor().newInstance();

        //为字段设置值
        f.set(per, "反射");

        //验证
        Person person = (Person)per;
        System.out.println("验证名字:" +person.name);

        //2.获取所有公有构造方法
        System.out.println("所有公有构造方法");
        Constructor[] conArray = clazz.getConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }


        System.out.println("所有的构造方法(包括：私有、受保护、默认、公有)");
        conArray = clazz.getDeclaredConstructors();
        for(Constructor c : conArray){
            System.out.println(c);
        }

        System.out.println("获取公有、无参的构造方法");
        Constructor con = clazz.getConstructor();
        System.out.println("con = " + con);
        //调用构造方法
        Object obj = con.newInstance();

        System.out.println("获取私有构造方法，并调用");
        con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)
        obj = con.newInstance('男');

        //获取所有公有方法
        System.out.println("获取所有的”公有“方法");
        clazz.getMethods();
        Method[] methodArray = clazz.getMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

        //获取所有方法
        System.out.println("获取所有的方法，包括私有的");
        methodArray = clazz.getDeclaredMethods();
        for(Method m : methodArray){
            System.out.println(m);
        }

        //获取特定的共有方法
        System.out.println("获取公有的eat()方法");
        Method m = clazz.getMethod("eat", String.class);
        System.out.println(m);
        //实例化一个Student对象
        obj = clazz.getConstructor().newInstance();
        m.invoke(obj, "反射");


        System.out.println("获取私有的study()方法");
        m = clazz.getDeclaredMethod("study", int.class);
        System.out.println(m);


        m.setAccessible(true);//解除私有限定
        Object result = m.invoke(obj, 20);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
        System.out.println("返回值：" + result);
    }
}
