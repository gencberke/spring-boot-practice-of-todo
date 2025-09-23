package com.berkedev.practicespringboottodoapp.data.repository;

import com.berkedev.practicespringboottodoapp.data.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TodoRepository extends JpaRepository<Todo,Long> {

    @Query("SELECT e FROM Todo e WHERE e.id = :id")
    Todo getTodoById(@Param("id") Long id);
}
