package com.patterns.Prototype.client;

import com.patterns.Prototype.framework.Product;

/**
 * 描述:
 *
 * @author yd
 * @create 2019-05-07 22:48
 */
public class UnderlinePen implements Product {

    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    public void use(String s) {
        System.out.println("do UnderlinePen use:" + s);
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
