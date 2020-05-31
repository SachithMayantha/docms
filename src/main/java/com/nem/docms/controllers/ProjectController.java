package com.nem.docms.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nem.docms.entities.Project;
import com.nem.docms.servies.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/")
	public List<Project> getAll(){
		return projectService.getAll();
	}
	
	@PostMapping("/")
	//RequestBody for bind request HTTP body with a domain object 
	public Project  addProject(@RequestBody Project pro){
		return projectService.addProject(pro);
	}
	
	@PutMapping("/{id}")
	public Project update(@RequestBody Project pro){
		return projectService.update(pro);
	}
	
	@DeleteMapping("/")
	//PathParam for map variable URI path to method call
	public void delete(@PathParam("id") String id){
		projectService.delete(id);
	}
}
