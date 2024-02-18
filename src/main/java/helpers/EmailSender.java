package helpers;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class EmailSender {

    public void sendReportByMail() {
        // Sender's email address
        String from = "automation@nafith.com";
        // Recipient's email address
        String receiver1 = "dyousef@nafith.com";
//        String receiver2 = "lmaaweed@nafith.com";
        // Sender's email password
        String password = "Automation-1234";

        // SMTP server setup
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "false");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        // Authenticator to authenticate the sender's credentials
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };

        // Get the default Session object.
        Session session = Session.getInstance(properties, authenticator);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiver1));
//            message.addRecipient(Message.RecipientType.CC, new InternetAddress(receiver2));

            // Set Subject: header field
            message.setSubject("Test Automation Report Nstar App23232332322332");

            // Create a multipart message
            Multipart multipart = new MimeMultipart();

            // Create the HTML part
            BodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent("<p>Attached html file contains the test result status of Nstar Automation Run</p>", "text/html");
            multipart.addBodyPart(htmlPart);

            // Attach the HTML file
            BodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.setDataHandler(new DataHandler(new FileDataSource
                    ("/Users/automation/Documents/GitHub/NafithAppsAutomation/test-output/ExtentReports/NafithAutomationReport_"
                            + getCurrentDateTime() + ".html")));
            attachmentPart.setFileName("NaifthAutomationReport.html");
            multipart.addBodyPart(attachmentPart);

            // Set the content of the message
            message.setContent(multipart);

            // Send message
            Transport.send(message);
            System.out.println("Run Report sent successfully ...");
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCurrentDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH");
        LocalDateTime now = LocalDateTime.now();

        return dtf.format(now);
    }
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendReportByMail();
    }
}
