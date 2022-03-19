package com.example.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todolist.entity.TodoListEntity;

@Repository
public interface TodoListRepository extends JpaRepository<TodoListEntity, Integer>{
	
}
