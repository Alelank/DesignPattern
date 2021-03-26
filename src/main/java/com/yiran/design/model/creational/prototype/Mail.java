package com.yiran.design.model.creational.prototype;

/**
 * Created by Ale on 2021/3/25
 */
public class Mail implements Cloneable{

    public Mail() {
        System.out.println("初始化");
    }

    private String name;

    private String content;

    private String mailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone object");
        return super.clone();
    }
}
