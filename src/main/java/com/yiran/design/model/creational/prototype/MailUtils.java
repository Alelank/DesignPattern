package com.yiran.design.model.creational.prototype;


import java.text.MessageFormat;

/**
 * Created by Ale on 2021/3/25
 */
public class MailUtils {

    public static void send(Mail mail) {
        String content = "向: {0}同学发送邮件，邮件地址: {1}，内容: {2}.";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getMailAddress(), mail.getContent()));
    }

    public static void save(Mail mail) {
        System.out.println("保存原始邮件" + mail);
    }
}
