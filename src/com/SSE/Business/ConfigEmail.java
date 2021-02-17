package com.SSE.Business;

import java.util.Properties;



public class ConfigEmail {
	
	private Properties properties;
	
	private String to;
	private String from;
	private String host;
	private String nameHost;
	private String message;
	private String subject;
	
	public ConfigEmail(String to, String from, String host, String nameHost, String message, String subject) {
		this.to = to;
		this.from = from;
		this.host = host;
		this.nameHost = nameHost;
		this.message = message;
		this.subject = subject;
	}

	public String getTo() {
		return to;
	}
	public String getFrom() {
		return from;
	}
	public String getHost() {
		return host;
	}
	public String getNameHost() {
		return nameHost;
	}
	public String getMessage() {
		return message;
	}
	public String getSubject() {
		return subject;
	}
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("/***");
		b.append(b.getClass().getName());
		b.append("***/");
		b.append("\n");
		b.append("To: ");
		b.append(to.equals("") ? "???" : to);
		b.append("\n");
		b.append("From: ");
		b.append(from.equals("") ? "???" : from);
		b.append("\n");
		b.append("Host: ");
		b.append(host.equals("") ? "???" : host);
		b.append("\n");
		b.append("NameHost: ");
		b.append(nameHost.equals("") ? "???" : nameHost);
		b.append("\n");
		b.append("Subject: ");
		b.append(subject.equals("") ? "???" : subject);
		b.append("\n");
		b.append("Message: ");
		b.append(message.equals("") ? "???" : message);
		b.append("\n");
		return b.toString();
	}
	
	
	
}
