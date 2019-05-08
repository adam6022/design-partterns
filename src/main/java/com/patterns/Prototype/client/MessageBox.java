package com.patterns.Prototype.client;

import com.patterns.Prototype.framework.Product;

/**
 * 描述:
 * 实现Product接口
 * @author yd
 * @create 2019-05-07 22:33
 */
public class MessageBox implements Product {

    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    public void use(String s) {
        System.out.println("do MessageBox use:" + s);
    }

    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
