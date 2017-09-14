package org.saral.restProject.modal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageBean {
	
	
	int id;
	String created;
	String author;
	String message;

	MessageBean(){
		
	}
	
	public MessageBean(int id, String created, String author, String message) {
		super();
		this.id = id;
		this.created = created;
		this.author = author;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
