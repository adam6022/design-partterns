package com.patterns.Prototype.framework;

/**
 * 描述:
 * @author yd
 * @create 2019-05-07 22:27
 */
public interface Product extends Cloneable{

    public abstract void use(String s);

    public abstract Product createClone();
}
