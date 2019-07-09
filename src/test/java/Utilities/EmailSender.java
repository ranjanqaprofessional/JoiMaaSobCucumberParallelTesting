package Utilities;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {
	

	

	public static void send_Simple_Email() throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("ranjan.seleniumtester@gmail.com", "Maa_15042019"));
		email.setSSLOnConnect(true);
		email.setFrom("ranjan.seleniumtester@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("Love you Kaanha.Sorry ... :-)");
		email.addTo("ransfastgud2@gmail.com");
		email.send();
		
	}
	
	public static void send_Email_with_attachment(String from, String to, String subject,
    String text) throws EmailException {
		
		// Create the attachment
//		  EmailAttachment attachment = new EmailAttachment();
//		  attachment.setPath("C:\\Users\\RBHD3\\Pictures\\Jai Maa Saraswati\\IMG_0602.JPG");
//		 
//		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
//		  attachment.setDescription("Latest Extent Report");
//		  attachment.setName("Jai Sai Nath");
//
//		  // Create the email message
//		  MultiPartEmail email = new MultiPartEmail();
//		  email.setHostName("mail.myserver.com");
//		  email.addTo("ransfastgud2@gmail.com");
//		  email.setFrom("ranjan.seleniumtester@gmail.com");
//		  email.setSubject("Jai Shree Krishna");
//		  email.setMsg("Radhe Radhe");
//
//		  // add the attachment
//		  email.attach(attachment);
//
//		  // send the email
//		 email.send();
		
		Properties props = new Properties();
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.socketFactory.class",
        "javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "465");
	    Session session = Session.getDefaultInstance(props,
	        new javax.mail.Authenticator() {
	          protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(
	            "ranjan.seleniumtester@gmail.com",
	            "Maa_15042019");// change accordingly
	          }
	        });
	    // compose message
	    try {
	      MimeMessage message = new MimeMessage(session);
      message.setFrom(new InternetAddress(from));// change accordingly
	    //  for (String to : tos) {
	        message.addRecipient(Message.RecipientType.TO,
	            new InternetAddress(to));
	    //  }
	      /*
//	       * for (String cc : ccs)
//	       * message.addRecipient(Message.RecipientType.CC,new
//	       * InternetAddress(cc));
//	       */
	      message.setSubject(subject);
//	      // Option 1: To send normal text message
//	      // message.setText(text);
//	      // Option 2: Send the actual HTML message, as big as you like
//	      // message.setContent("<h1>This is actual message</h1></br></hr>" +
//	      // text, "text/html");
	      // Set the attachment path
	      String filename = "C:\\Users\\RBHD3\\Pictures\\Jai Maa Saraswati\\IMG_0602.JPG";
	      BodyPart objMessageBodyPart = new MimeBodyPart();
	      // Option 3: Send text along with attachment
	      objMessageBodyPart.setContent(
	          "<h1>Mail from Selenium Project!</h1></br>" + text, "text/html");
	      Multipart multipart = new MimeMultipart();
	      multipart.addBodyPart(objMessageBodyPart);
	      objMessageBodyPart = new MimeBodyPart();
	      DataSource source = new FileDataSource(filename);
	      objMessageBodyPart.setDataHandler(new DataHandler(source));
         objMessageBodyPart.setFileName(filename);
	      multipart.addBodyPart(objMessageBodyPart);
	      message.setContent(multipart);
	      // send message
	      Transport.send(message);
	      System.out.println("message sent successfully");
    } catch (MessagingException e) {
	      throw new RuntimeException(e);
	    }
	  }// End of SEND method
		
		
	}
	
	
	
	




	
	
	

	
	

	


