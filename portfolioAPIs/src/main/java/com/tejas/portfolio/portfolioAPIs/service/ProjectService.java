package com.tejas.portfolio.portfolioAPIs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejas.portfolio.portfolioAPIs.entity.Project;
import com.tejas.portfolio.portfolioAPIs.repository.ProjectRepo;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepo repo;
	
	public Project postProject(Project project)
	{
		System.out.println("Inside Service");
		return repo.save(project);
	}
	
	public List<Project> getAllProjects()
	{
		return this.repo.findAll();
	}
	
	
}
