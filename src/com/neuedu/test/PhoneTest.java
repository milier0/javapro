package com.neuedu.test;

/**
 * Created by hy on 2020/2/11.
 */
public class PhoneTest {
    public static void main(String[] args) {
        Earphone earphone = new Earphone();
        Charger charger = new Charger();
        Phone phone = new Phone();
        phone.setSocket(earphone);
        phone.method();
    }
}
