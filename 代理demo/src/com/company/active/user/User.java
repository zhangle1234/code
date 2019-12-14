package com.company.active.user;

import com.company.active.proxy.ProxyUsb;
import com.company.active.target.UsbJSFactory;
import com.company.statics.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 15:48
 */
public class User {
    public static void main(String[] args) {
        //可以看动态代理类的源码
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //声明目标类对象，带传入动态代理的构造方法中
        UsbJSFactory uf = new UsbJSFactory();

        //获取动态代理对象
        Proxy proxy = new ProxyUsb(uf).getProxyObject();

        float $ = ((UsbSell)proxy).usbSell(200);
        System.out.println($);

}
}
