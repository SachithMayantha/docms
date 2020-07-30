  package com.nem.docms.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nem.docms.entities.Project;
import com.nem.docms.repositories.ProjectRepository;

@Service 
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	public List<Project> getAll() {
		// TODO Auto-generated method stub
		System.out.println("project list service called");
		return projectRepository.findAll();
	}
	
	public Project getProject(String id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(id).get();
	}

	public Project addProject(Project pro) {
		// TODO Auto-generated method stub
		return projectRepository.insert(pro);
	}

	public Project update(Project pro) {
		// TODO Auto-generated method stub
		return projectRepository.save(pro);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		projectRepository.deleteById(id);
	}

}