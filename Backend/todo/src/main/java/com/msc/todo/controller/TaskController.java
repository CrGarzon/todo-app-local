package com.msc.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.msc.todo.entities.Task;
import com.msc.todo.repositories.TaskRepository;



@RestController
@RequestMapping("/task")
@CrossOrigin
public class TaskController {
//Inyeccion de dependencias
	@Autowired
	private TaskRepository taskRepositoryDAO;
	
	@RequestMapping(path="/get-all", method = RequestMethod.GET)
	public @ResponseBody List<Task> getAllTask(){
		return taskRepositoryDAO.findAll();
	}
	
}
