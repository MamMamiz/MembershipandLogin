package membershipAndLoginHomework.entites.concretes;

import membershipAndLoginHomework.entites.abstracts.IEntity;

public class User implements IEntity{
	
	private int id;
	private String name;
	private String surName;
	private String userName;
	private String email;
	private String password;
	
	
	public User () {}

	public User(int id, String name, String surName,String userName , String email, String password) {
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	

}
