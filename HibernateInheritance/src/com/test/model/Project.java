package com.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Project implements Serializable {
	private int id;
	private String title;

	@Id
	@GeneratedValue(generator = "projseq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "projseq", sequenceName = "projseq")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Project(int id, String title) {
		super();
		this.id = id;
		this.title = title;

	}

	public Project() {
		super();
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + "]";
	}

}
