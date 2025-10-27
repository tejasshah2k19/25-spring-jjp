package com.service;

import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailerService {

	@Autowired
	private JavaMailSender mailSender;

	public void sendWelcomeMail(String firstName,String to) throws Exception {

		Path path = new ClassPathResource("templates/Welcome.html").getFile().toPath();
		String htmlTemplate = Files.readString(path);


		
		String htmlContent = htmlTemplate.replace("${name}", firstName);

		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setTo(to);
		helper.setSubject("Welcome to Our Platform!");
		helper.setText(htmlContent, true);

		mailSender.send(message);
	}
}
