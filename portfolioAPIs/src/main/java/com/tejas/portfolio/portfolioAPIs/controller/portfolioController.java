package com.tejas.portfolio.portfolioAPIs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tejas.portfolio.portfolioAPIs.entity.Project;
import com.tejas.portfolio.portfolioAPIs.service.ProjectService;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin("*")
public class portfolioController {
	
	@Autowired
	ProjectService projectService;
	
	@PostMapping("addPro")
	public ResponseEntity<Project> postProject(@RequestBody Project project)//Here we will take the project details from frontEnd and then store them into our database
	{
		System.out.println("Inside Controller");
		return new ResponseEntity<>(projectService.postProject(project),HttpStatus.OK);
//		return new ResponseEntity<>("project added",HttpStatus.OK);
	}
	
	@GetMapping("/getPro")
	public ResponseEntity<List<Project>> getAllProjects()
	{
		List<Project> projects =  projectService.getAllProjects();
		return new ResponseEntity<>(projects,HttpStatus.OK);
	}

}
