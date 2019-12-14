package com.company.demo.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 19:09
 */
public class ProxyMethod implements InvocationHandler {

    private Object target;

    public ProxyMethod(Object obj){
        this.target = obj;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            Object result = null;
        System.out.println("目标方法前"+new Date());
            result = method.invoke(target,args);
        System.out.println("目标方法后"+new Date());

        return result;
    }

    public Proxy getProxy(){
       return (Proxy) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
