package com.ozge.todolistapp.converter;

import com.ozge.todolistapp.dto.RequestDto.TodoRequestDto;
import com.ozge.todolistapp.dto.ResponseDto.TodoResponseDto;
import com.ozge.todolistapp.entity.Todo;
import com.ozge.todolistapp.repository.TodoRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class TodoConverter {
    private final TodoRepository todoRepository;

    public TodoConverter(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public Todo convertTodoRequestDtoToTodo(TodoRequestDto todoRequestDto){

        Todo todo = Todo.builder()
                .title(todoRequestDto.getTitle())
                .content(todoRequestDto.getContent())
                .isCompleted(false)
                .taskDate(todoRequestDto.getTaskDate())
                .build();
        return todo;
    }

    public TodoResponseDto convertTodoToTodoResponseDto(Todo todo){

        TodoResponseDto todoResponseDto= TodoResponseDto.builder()
                .title(todo.getTitle())
                .content(todo.getContent())
                .isCompleted(todo.getIsCompleted())
                .taskDate(todo.getTaskDate())
                .build();
        return todoResponseDto;
    }

}
