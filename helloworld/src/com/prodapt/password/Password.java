package com.prodapt.password;

public class Password {
	public String  username;
    public String password;
	
	
    public Password() {
	}


	public Password(String username, String password) {
		this.username = username;
		this.password = password;
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


	@Override
	public String toString() {
		return "Password [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
