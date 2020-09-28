package com.email.sending.Email.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.email.sending.Email.Model.User;

@Service
public class NotificationService {
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotification(User user) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setFrom("guhanmsguga@gmail.com");
		mail.setSubject("Sending Mail");
		mail.setText("I am sending mail from Spring Boot Application");
		
		javaMailSender.send(mail);
	}
}
