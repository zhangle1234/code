package com.company.active.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 16:14
 */
public class ProxyUsb implements InvocationHandler {

    private Object target;

    //传入外部目标对象
    public ProxyUsb(Object obj){
        this.target = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        result = method.invoke(target,args);

        if(result!=null){
            result = (float)result+20;

        }
        return result;
    }

    public Proxy getProxyObject(){
        return (Proxy) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
