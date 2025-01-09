package com.joaogeringer.taskmanagement.controller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.joaogeringer.taskmanagement.entity.todo;
import com.joaogeringer.taskmanagement.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<todo> create(@RequestBody Todo todo) {
        return todoService.list();
    }
    @GetMapping
    List<todo> list() {
        return todoService.list();
    }
    @PutMapping
    List<Todo> update(Todo todo) {
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id" Long id) {
        return todoService.delete(id);
    }
}
