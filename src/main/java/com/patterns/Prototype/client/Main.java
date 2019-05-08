package com.patterns.Prototype.client;

import com.patterns.Prototype.framework.Manager;
import com.patterns.Prototype.framework.Product;

/**
 * 描述:
 *
 * @author yd
 * @create 2019-05-07 22:49
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);

        //生成
        /**
         * 并没有使用类名，取而代之使用的字符串名称来生成实例命名，
         * 与Java语言自带的生成实例的方法相比要具有具有更好的通用
         * 性，而且将框架从类名的束缚中解放出来了
         */
        Product strongMessage = manager.create("strong message");
        strongMessage.use("hello world");

    }
}
