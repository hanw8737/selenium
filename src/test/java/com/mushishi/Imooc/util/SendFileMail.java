package com.mushishi.Imooc.util;

import java.io.File;
import java.text.SimpleDateFormat;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.testng.annotations.Test;

public class SendFileMail {

	public static void main(String[] args) {
		System.out.println("this is test----------------->");
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName("smtp.163.com");
		mail.setAuthentication("mushishi_xu@163.com", "TEST1234");
		try {
			mail.setFrom("mushishi_xu@163.com");
			mail.addTo("609732836@qq.com");
			mail.setSubject("selenium subject");
			mail.setCharset("UTF-8");
			mail.setHtmlMsg("<a href=\"\"> 测试报告");
			EmailAttachment emailattachment = new EmailAttachment();
			emailattachment.setPath("E:\\www\\ImoocSelenium\\Imooc\\report.html");
			emailattachment.setName("测试报告.html");
			emailattachment.setDescription(EmailAttachment.ATTACHMENT);
			mail.attach(emailattachment);
			mail.send();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
