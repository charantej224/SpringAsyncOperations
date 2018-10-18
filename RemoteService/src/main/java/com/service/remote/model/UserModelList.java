package com.service.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModelList {

	@JsonProperty("name")
	String name;
	
	@JsonProperty("user")
	String user;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


	
	
	
}
