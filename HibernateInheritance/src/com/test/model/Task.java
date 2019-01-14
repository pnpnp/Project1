package com.test.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Task extends Module implements Serializable {
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + "]";
	}

	public Task() {
		// TODO Auto-generated constructor stub
	}

}
