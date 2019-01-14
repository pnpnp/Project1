package com.test.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Module extends Project implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Module() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Module [name=" + name + "]";
	}

}
