package com.itlize.assignments;

import com.itlize.assignments.Entity.*;
import com.itlize.assignments.Repository.*;
import com.itlize.assignments.Service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class OneApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	ProjectColumnRepository projectColumnRepository;

	@Autowired
	ProjectResourceRepository projectResourceRepository;

	@Autowired
	ResourceRepository resourceRepository;

	@Autowired
	ResourceDetailRepository resourceDetailRepository;

	@BeforeAll
	public static void setUp() {

//		User newUser = new User();
//		newUser.setUsername("Jordan123");
//		newUser.setTitle("Manager");
//		newUser.setRole("Developer");
//		newUser.setTimeCreated(LocalDateTime.now().minusDays(3));
//		newUser.setLastUpdated(LocalDateTime.now());
//		newUser.setPassword("123");
//		userRepository.save(newUser);
//
////		User newUserCopy = new User();
////		newUserCopy.setUsername("Jordan123");
////		newUserCopy.setTitle("Manager");
////		newUserCopy.setRole("Developer");
////		newUserCopy.setTimeCreated(LocalDateTime.now().minusDays(3));
////		newUserCopy.setLastUpdated(LocalDateTime.now());
////		newUserCopy.setPassword("123");
////		userRepository.save(newUserCopy);
//
//		Project newProject = new Project();
//		newProject.setTimeCreated(LocalDateTime.now().minusDays(3));
//		projectRepository.save(newProject);
//
//		ProjectResource newProjectResource = new ProjectResource();
//		newProjectResource.setTimeCreated(LocalDateTime.now().minusDays(3));
//		projectResourceRepository.save(newProjectResource);
//
//		Resource newResource = new Resource();
//		newResource.setTimeCreated(LocalDateTime.now().minusDays(3));
//		resourceRepository.save(newResource);
//
//		ResourceDetail newResourceDetail = new ResourceDetail();
//		newResourceDetail.setTimeCreated(LocalDateTime.now().minusDays(3));
//		newResourceDetail.setLastUpdated(LocalDateTime.now());
//		newResourceDetail.setNewValue(1);
//		resourceDetailRepository.save(newResourceDetail);
//
//		ProjectColumn newProjectColumn = new ProjectColumn();
//		newProjectColumn.setColumnName("TestColumnName");
//		newProjectColumn.setType(ProjectColumn.Type.TEXT);
//		newProjectColumn.setFormulaText("TestFormulaText");
//		projectColumnRepository.save(newProjectColumn);
//
//		newUser.setProject(newProject);
//		newProject.setOwners(new ArrayList<>(Arrays.asList(newUser)));
//		newProject.setProjectResource(newProjectResource);
//		newProject.setProjectColumn(newProjectColumn);
//		newProjectColumn.setProjectIds(new ArrayList<>(Arrays.asList(newProject)));
//		newProjectColumn.setResourceDetail(newResourceDetail);
//		newProjectResource.setProjects(new ArrayList<>(Arrays.asList(newProject)));
//		newProjectResource.setResources(new ArrayList<>(Arrays.asList(newResource)));
//		newResource.setProjectResource(newProjectResource);
//		newResource.setResourceDetail(newResourceDetail);
//		newResourceDetail.setResources(new ArrayList<>(Arrays.asList(newResource)));
//		newResourceDetail.setProjectColumns(new ArrayList<>(Arrays.asList(newProjectColumn)));
//
//		userRepository.save(newUser);
//		projectRepository.save(newProject);
//		projectResourceRepository.save(newProjectResource);
//		resourceRepository.save(newResource);
//		resourceDetailRepository.save(newResourceDetail);
//		projectColumnRepository.save(newProjectColumn);

	}

	@Test
	void saveTest() {


	}


}