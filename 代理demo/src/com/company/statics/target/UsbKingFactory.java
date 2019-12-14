package com.company.statics.target;

import com.company.statics.service.UsbSell;

/**
 * @author zhangle
 * @Date 2019/12/3
 * @time 15:42
 */
public class UsbKingFactory implements UsbSell {
    @Override
    public float usbSell(int count) {
        return 100;
    }
}
