package com.patterns.Builder;

/**
 * 描述:
 * 定义了决定文档结构的方法的抽象类
 *  [建造者，定义用于生成的接口，Builder角色中准备了用于生成实例的方法]
 * @author yd
 * @create 2019-05-08 16:51
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
