package com.patterns.Prototype.framework;

import java.util.HashMap;

/**
 * 描述:
 * 使用Product类来复制实例
 * @author yd
 * @create 2019-05-07 22:28
 */
public class Manager {

    private HashMap showcase = new HashMap();

    public void register(String name, Product proto){
        showcase.put(name, proto);
    }

    public Product create(String protoname){
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }

}
