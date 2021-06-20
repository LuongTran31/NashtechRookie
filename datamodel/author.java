package com.nashtechglobal.datamodel;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class author {
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private LocalDate birthDate;
	private LocalDateTime added;
	
	
	
	public author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public author(String username, String password, String firstname, String lastname, String email,
			LocalDate birthDate, LocalDateTime added) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.birthDate = birthDate;
		this.added = added;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public LocalDateTime getAdded() {
		return added;
	}
	public void setAdded(LocalDateTime added) {
		this.added = added;
	}
	@Override
	public String toString() {
		return "author [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", birthDate=" + birthDate + ", added=" + added + "]";
	}
	
	
}
