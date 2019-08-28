package com.keshav.SpringBootExample;
import java.util.Properties;
import java.util.Random;

import javax.mail.*;
import javax.mail.internet.*;  
  
public class SendEmail  
{  
	public String otp(String email)
	{
	String host="smtp.gmail.com";  
	  final String user="KeshavSharma8550@gmail.com";//change accordingly  
	  final String password="Keshav@1996";//change accordingly  
	   
	  
	   //Get the session object  
	   Properties props = new Properties();  
	   props.put("mail.smtp.host",host);  
	   props.put("mail.smtp.socketFactory.port", "587");
	   props.put("mail.smtp,socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	   props.put("mail.smtp.auth", "true"); 
	   props.put("mail.smtp.port", 587);
	   props.put("mail.transport.protocol", "smtp");
	   props.put("mail.smtp.starttls.enable", "true");
	   props.put("mail.debug", "true");
	   //props.put("mail.setTLS","true");
	   //props.put("mail.smtp.STARTTLS","true");
	     
	   Session session = Session.getDefaultInstance(props,  
	    new javax.mail.Authenticator() {  
	      protected PasswordAuthentication getPasswordAuthentication() {  
	    return new PasswordAuthentication(user,password);  
	      }  
	    }); 
	   session.setDebug(true);
	  
	   //Compose the message  
	   Random random=new Random();
	     int i=random.nextInt(9000)+1000;
	    try {  
	     Message message = new MimeMessage(session);  
	     message.setFrom(new InternetAddress(user));  
	     message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));  
	     message.setSubject("javatpoint");  
	     
	     message.setText("OTP for registration confirmation is"+i);  
	       
	    //send the message  
	     Transport.send(message);  
	  
	     System.out.println("message sent successfully...");  
	   
	     } catch (MessagingException e) {e.printStackTrace();}
	    String otp=Integer.toString(i);
		return otp; 
	    
	}
}  