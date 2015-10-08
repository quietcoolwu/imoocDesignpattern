package com.imooc;

/**
 * Created by William on 2015/10/8.
 * <p>
 * 懒汉模式
 * 加载类时比较快,在加载类时没有创建对象,运行时获取对象的速度慢,但此线程不安全
 */
public class Singleton2 {
    //2.创建类的唯一实例,使用private static修饰
    private static Singleton2 instance;

    //1.构造方法私有化
    private Singleton2() {

    }

    //3.提供一个用于获取实例的方法, 使用public static修饰
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }


}
