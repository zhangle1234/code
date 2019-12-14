package com.company.active.target;

import com.company.statics.service.UsbSell;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 16:02
 */
public class UsbJSFactory implements UsbSell {

    @Override
    public float usbSell(int count) {
        return 100;
    }
}
