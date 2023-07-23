package com.tashumi.showcase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Message {

	private String message;
	private @Id String id;
	public Message() {
	}

	public Message(String Id, String message) {
		this.id = Id;
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
