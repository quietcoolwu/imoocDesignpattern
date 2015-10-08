package com.imooc;
/*
饿汉模式
有些对象只需要一个就够了
作用保证呢整个应用程序中某个实例有且只有一个

特点:加载类时比较慢(加载类时要创建实例),但运行时获取对象速度快,因为对象在类加载时已经创建,但此线程安全
 */

public class Singleton {
    //在外部无法创建实例,怎么办?
    //创建类的唯一实例,且变为类的成员(static),那加上private呢?
    private static Singleton instance = new Singleton();

    //1.将构造方法私有化,不允许外部直接创建对象
    private Singleton() {

    }

    //可提供用于获取实例的方法,用public static修饰
    public static Singleton getInstance() {
        return instance;
    }
}
