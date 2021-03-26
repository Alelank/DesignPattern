package com.yiran.design.model.creational.prototype;

/**
 * Created by Ale on 2021/3/25
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("原始模版");
//        for (int i = 0; i < 10; i++) {
//            Mail cloneMail = (Mail) mail.clone();
//            cloneMail.setName("星" + i);
//            cloneMail.setMailAddress("星" + i + "yiran.com");
//            cloneMail.setContent("恭喜获得奖品。");
//            MailUtils.send(cloneMail);
//        }
//        MailUtils.save(mail);


        Sheep sheep = new Sheep("jack","黑");
        sheep.setMail(mail);

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();


        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
