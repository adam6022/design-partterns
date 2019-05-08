package com.patterns.Builder;

/**
 * 描述:
 * 编写一个文档的类
 * [监工，负责使用Builder接口来生成实例，它只调用在Builder中定义的方法。组装的具体方法被隐藏在Director中]
 * @author yd
 * @create 2019-05-08 18:58
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到下午");
        builder.makeItems(new String[]{
                "早上好",
                "下午好"
        });
        builder.makeString("晚上");
        builder.close();
    }

}
