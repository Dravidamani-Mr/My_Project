/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author kani
 */
public class NewClass {
    public static void main(String[] args){
        
        final String userName="kanidreamfruits";
        final String password="kani4321";
        final String togmail ="dmani56as@gmail.com";
        Properties props= System.getProperties();
        //System.out.print("properties"+props);
        props.put("mail.smtp.user",userName);
        props.put("mail.smtp.password",password);
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","465");
        props.put("mail.debug","true");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        //props.put("mail.smtp.ssl.enable","true");
        
        
        //props.setProperty("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        //props.setProperty("mail.smtp.socketFactory.fallback","false");
        
        //props.setProperty("mail.smtp.socketFactory.port","587");

        Session session = Session.getInstance(props);
        session.setDebug(true);
        System.out.println("point2");
        try{  
             System.out.println("point3");
             Message message = new MimeMessage(session);  
             System.out.println("point4");
             message.setFrom(new InternetAddress(userName));  
             System.out.println("point5");
             message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(togmail));  
             System.out.println("point6");
             message.setSubject("Ping");  
             message.setText("Hello, this is example of sending email  ");  

             // Send message  
             Transport.send(message);
             System.out.println("point7");
             System.out.println("message sent successfully....");  

          }catch (MessagingException mex) {
              System.out.println(mex+"***");
              mex.printStackTrace();
          } 
        }
    
}
