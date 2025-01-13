package com.joaogeringer.taskmanagement.service;
import java.util.List;
import java.util.Properties;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.joaogeringer.taskmanagement.entity.todo;
import com.joaogeringer.taskmanagement.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<todo> list() {
      Sort sort = Sort.by(...Properties:"prioridade").descending().and(
        Sort.by(...Properties:"nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    
    public List<todo> delete() {
        todoRepository.deleteById(id);
        return list();
    }

    private Object descending() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void ascending() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}

