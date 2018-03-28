package com.onlineportal.tp.service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.hibernate.Transaction;

public class EmailDispatcher {

	public void sendEmail(String toMail, String message) {
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFActory.port", "465");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		System.out.println("propeties set");
		Session session = Session.getDefaultInstance(properties,
				new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("nikhi.ajay96@gmail.com", "mouNiki412");
				}
				});
		
		System.out.println("session set");
		//Composing and sending email
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress("nikhi.ajay96@gmail.com"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toMail));
			msg.setSubject("KCE|Online Course Learning Portal Access Details");
			msg.setText(message);
			System.out.println("Sending email");
			Transport.send(msg); 

			
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
}
