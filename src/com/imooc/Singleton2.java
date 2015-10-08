package com.imooc;

/**
 * Created by William on 2015/10/8.
 * <p>
 * ����ģʽ
 * ������ʱ�ȽϿ�,�ڼ�����ʱû�д�������,����ʱ��ȡ������ٶ���,�����̲߳���ȫ
 */
public class Singleton2 {
    //2.�������Ψһʵ��,ʹ��private static����
    private static Singleton2 instance;

    //1.���췽��˽�л�
    private Singleton2() {

    }

    //3.�ṩһ�����ڻ�ȡʵ���ķ���, ʹ��public static����
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }


}
