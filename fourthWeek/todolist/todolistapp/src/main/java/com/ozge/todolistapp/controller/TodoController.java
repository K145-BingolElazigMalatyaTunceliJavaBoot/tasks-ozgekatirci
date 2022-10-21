package com.ozge.todolistapp.controller;

import com.ozge.todolistapp.dto.ResponseDto.TodoResponseDto;
import com.ozge.todolistapp.dto.ResponseDto.UserResponseDto;
import com.ozge.todolistapp.entity.Todo;
import com.ozge.todolistapp.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@AllArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/save")
    public ResponseEntity<UserResponseDto> saveTodo(@RequestParam Long userId, @RequestBody Todo todo){

        UserResponseDto userResponseDTO = todoService.addTodoToUser(userId, todo);
        return ResponseEntity.ok(userResponseDTO);
    }


    @GetMapping("/list")
    public ResponseEntity<List<TodoResponseDto>>findUserAllTodo(@RequestParam Long userId){
        List<TodoResponseDto> todoList = todoService.findUserAllTodo(userId);
        return ResponseEntity.ok(todoList);
    }
    /*
    @DeleteMapping("/delete")
    public ResponseEntity<String>delete

    //daily
    @GetMapping("/daily")
    //weekly
    @GetMapping("/weekly")


     */






}
