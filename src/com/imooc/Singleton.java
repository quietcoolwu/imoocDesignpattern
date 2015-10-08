package com.imooc;
/*
����ģʽ
��Щ����ֻ��Ҫһ���͹���
���ñ�֤������Ӧ�ó�����ĳ��ʵ������ֻ��һ��

�ص�:������ʱ�Ƚ���(������ʱҪ����ʵ��),������ʱ��ȡ�����ٶȿ�,��Ϊ�����������ʱ�Ѿ�����,�����̰߳�ȫ
 */

public class Singleton {
    //���ⲿ�޷�����ʵ��,��ô��?
    //�������Ψһʵ��,�ұ�Ϊ��ĳ�Ա(static),�Ǽ���private��?
    private static Singleton instance = new Singleton();

    //1.�����췽��˽�л�,�������ⲿֱ�Ӵ�������
    private Singleton() {

    }

    //���ṩ���ڻ�ȡʵ���ķ���,��public static����
    public static Singleton getInstance() {
        return instance;
    }
}
