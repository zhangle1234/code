package com.company.demo.target;

import com.company.demo.service.Service;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 19:05
 */
public class Serviceimpl implements Service {
    @Override
    public void dosome(String name) {
        System.out.println("执行了doSome方法");
    }
}
