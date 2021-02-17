package com.SSE.Presentation;

import com.SSE.Business.ConfigEmail;
import com.SSE.Utils.Teclat;

public class Main {

	private static String to;
	private static String from;
	private static String host;
	private static String nameHost;
	private static String message;
	private static String subject;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to: SpamSendEmail");
		System.out.println("This system use it for send email to someone.");
		System.out.println("");
		to = Teclat.demanar_String("Who is your email for?", false);
		subject = Teclat.demanar_String("What is the subject in the Email?", false);
		message = Teclat.demanar_String("Write you text to send:", false);
		ConfigEmail config = new ConfigEmail("botkuki21@gmail.com",to,"unkonw","smtp.google.http", subject,message);
		System.out.println(config);
		
		for(int i = 0; i!=10; i++){
			
		}
		
		for(int i = 0; i!=10; i++){
			
		}
		
	}

}
