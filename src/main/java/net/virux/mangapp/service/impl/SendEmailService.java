package net.virux.mangapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("endEmailService")
public class SendEmailService {

	@Autowired
	private MailSender mailSender;
	
	public void readySendEmail(String toAddress, String fromAddress, String subject, 
			String msgBody){
		System.out.println(mailSender);
		
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(fromAddress);
		simpleMailMessage.setTo(toAddress);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(msgBody);
		mailSender.send(simpleMailMessage);
	}
}
