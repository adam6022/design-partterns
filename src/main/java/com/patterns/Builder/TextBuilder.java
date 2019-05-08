package com.patterns.Builder;

/**
 * 描述:
 * 使用纯文本编写文档
 * @author yd
 * @create 2019-05-08 19:03
 */
public class TextBuilder extends Builder{

    private StringBuffer buffer = new StringBuffer();

    public void makeTitle(String title) {
        buffer.append("===========================\n");
        buffer.append(title).append("\n");
        buffer.append("\n");
    }

    public void makeString(String str) {
        buffer.append(str).append("\n\n");
    }

    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("   `" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    public void close() {
        buffer.append("==============================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
