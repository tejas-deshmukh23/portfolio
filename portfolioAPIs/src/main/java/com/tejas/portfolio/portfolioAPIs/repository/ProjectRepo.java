package com.tejas.portfolio.portfolioAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tejas.portfolio.portfolioAPIs.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
