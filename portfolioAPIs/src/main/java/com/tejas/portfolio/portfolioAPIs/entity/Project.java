package com.tejas.portfolio.portfolioAPIs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	int id;
	@Column(name="title")
	String title;
	@Column(name="imagepath")
	String imagePath;
	@Column(name="description")
	String description;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(int id, String title, String imagePath, String description) {
		super();
		this.id = id;
		this.title = title;
		this.imagePath = imagePath;
		this.description = description;
	}

	public Project(String title, String imagePath, String description) {
		super();
		this.title = title;
		this.imagePath = imagePath;
		this.description = description;
	}

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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
