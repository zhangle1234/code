package com.company.demo.test;

import com.company.demo.agent.ProxyMethod;
import com.company.demo.service.Service;
import com.company.demo.target.Serviceimpl;

import java.lang.reflect.Proxy;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 19:16
 */
public class Main {
    public static void main(String[] args) {

        Service service = new Serviceimpl();

        Proxy proxy = new ProxyMethod(service).getProxy();

        ((Service)proxy).dosome("龙龙君");
    }

}
