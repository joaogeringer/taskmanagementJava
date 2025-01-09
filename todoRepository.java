package com.joaogeringer.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaogeringer.taskmanagement.entity.todo;

public interface  TodoRepository extends JpaRepository<todo, Long>{

}
