package com.company.statics.user;

import com.company.statics.proxy.JD;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 15:45
 */
public class User {
    public static void main(String[] args) {

        //声明代理对象
        JD jd = new JD();
        float $ = jd.usbSell(10);
        System.out.println("JD代理的Usb的单价是"+$+"元");
    }
}
