package com.todo.mvc.Repo;


import com.todo.mvc.POJO.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
