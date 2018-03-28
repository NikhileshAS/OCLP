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


public class EmailDispatcher {
	
	private String toMail;
	private String message;

	public EmailDispatcher(String toMail, String message) {
		super();
		System.out.println("propeties set");
		this.toMail = toMail;
		this.message = message;
	}
	

	public void sendEmail() {
		System.out.println("propeties set");
		Properties properties = new Properties();		
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.port", "465");
		Session session = Session.getDefaultInstance(properties,
				new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("nikhi.ajay96@gmail.com", "mouNiki412");
				}
				});
		
		System.out.println("session set");
		//Composing and sending email
		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("nikhi.ajay96@gmail.com"));
			msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(toMail));
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
