package com.tnsit.abstraction;

abstract class Notification{
	abstract void sendMessage(String message);
	
}
class EmailNotification extends Notification{

	@Override
	void sendMessage(String message) {
		// TODO Auto-generated method stub
		String email="soop123@gmail.com";
		System.out.println("sending email...");
		System.out.println("To:"+email);
		System.out.println("Message:"+message);
		
		int messagelength=message.length();
		System.out.println("message length:"+messagelength);
	}
	
}


public class NotificationDemo {

public static void main(String[] args) {
	EmailNotification e = new EmailNotification();
	e.sendMessage("your project is approved");
}
	
}
