package com.email.sending.Email.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.sending.Email.Model.User;
import com.email.sending.Email.Service.NotificationService;

@RestController
public class RegistrationController {

	@Autowired
	private NotificationService notificationService;

	@RequestMapping("/signup")
	public String signup() {
		return "Please sign up for our service";
	}

	@RequestMapping("/signup-success")
	public String signupSuccess() {

		// create user
		User user = new User();
		user.setFirstName("Guhan");
		user.setLastName("M S");
		user.setEmailAddress("guhanmsguga@gmail.com");

		// sending a notification

		notificationService.sendNotification(user);

		return "Thank you for registerating with us";
	}
}
