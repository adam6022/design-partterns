package com.patterns.Builder;

/**
 * 描述:
 * 主类， 测试程序行为
 * Builder模式
 * [使用者]
 * 编写文档程序：
 * - 含有一个标题
 * - 含有几个字符串
 * - 含有条目项目
 * @author yd
 * @create 2019-05-08 16:49
 */
public class Main {

    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String res = textBuilder.getResult();
        System.out.println(res);
    }



}
