package com.ozge.todolistapp.converter;

import com.ozge.todolistapp.dto.RequestDto.UserRequestDto;
import com.ozge.todolistapp.dto.ResponseDto.UserResponseDto;
import com.ozge.todolistapp.entity.User;
import com.ozge.todolistapp.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component

public class UserConverter {
    private final UserRepository userRepository;
    private final TodoConverter todoConverter;

    public UserConverter(UserRepository userRepository, TodoConverter todoConverter) {
        this.userRepository = userRepository;
        this.todoConverter = todoConverter;
    }

    public User convertUserRequestDtoToUser(UserRequestDto UserRequestDto){
        User user = User.builder()
                .Name(UserRequestDto.getName())
                .Surname(UserRequestDto.getSurname())
                .toDoList(new ArrayList<>())
                .build();

        userRepository.save(user);
        return user;

    }
    public UserResponseDto convertUserToUserToUserResponseDto(User user){
        UserResponseDto userResponseDto = UserResponseDto.builder()
                .id(user.getId())
                .Name(user.getName())
                .toDoList(user.getToDoList())
                .build();

        return userResponseDto;
    }

}
