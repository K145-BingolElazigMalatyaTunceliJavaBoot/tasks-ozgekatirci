package com.ozge.todolistapp.service;

import com.ozge.todolistapp.converter.TodoConverter;
import com.ozge.todolistapp.converter.UserConverter;
import com.ozge.todolistapp.dto.ResponseDto.TodoResponseDto;
import com.ozge.todolistapp.dto.ResponseDto.UserResponseDto;
import com.ozge.todolistapp.entity.Todo;
import com.ozge.todolistapp.entity.User;
import com.ozge.todolistapp.repository.TodoRepository;
import com.ozge.todolistapp.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final TodoConverter todoConverter;
    private final UserService userService;
    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserResponseDto addTodoToUser(Long userId, Todo todo){

        User user = userService.findUserById(userId);
        user.getToDoList().add(todo);
        todoRepository.save(todo);
        userRepository.save(user);
        return userConverter.convertUserToUserToUserResponseDto(user);
    }

    public UserResponseDto removeTodoFromUser(Long userId,Todo todo){
        User user = userService.findUserById(userId);
        user.getToDoList().remove(todo);
        todoRepository.deleteById(todo.getId());
        userRepository.deleteById(userId);
        return userConverter.convertUserToUserToUserResponseDto(user);
    }

    public List<TodoResponseDto> findUserAllTodo(Long userId){
        User user = userService.findUserById(userId);
        List<TodoResponseDto> todoList = user.getToDoList().stream().
                map(todo->todoConverter.convertTodoToTodoResponseDto(todo))
                .collect(Collectors.toList());
        return todoList;
    }

/*

    public TodoResponseDto findUserTodoDaily(Long userId){

    }

 */



}
