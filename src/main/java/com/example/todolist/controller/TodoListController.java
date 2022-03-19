package com.example.todolist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.todolist.entity.TodoListEntity;
import com.example.todolist.repository.TodoListRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TodoListController {
	
	private final TodoListRepository todoListRepository;
	
	@GetMapping("/todo")
	public ModelAndView showTodoList(ModelAndView mv) {
		mv.setViewName("TodoList");
		List<TodoListEntity> todoListEntity = todoListRepository.findAll();
		mv.addObject("todoList", todoListEntity);
		return mv;
	}
	
}
