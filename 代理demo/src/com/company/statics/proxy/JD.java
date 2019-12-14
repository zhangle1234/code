package com.company.statics.proxy;

import com.company.statics.service.UsbSell;
import com.company.statics.target.UsbKingFactory;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 15:43
 */
public class JD implements UsbSell {

    //声明目标对象
    UsbKingFactory uf = new UsbKingFactory();



    @Override
    public float usbSell(int count) {
        float much = uf.usbSell(count);
        much = much+20;

        return much;

    }
}
