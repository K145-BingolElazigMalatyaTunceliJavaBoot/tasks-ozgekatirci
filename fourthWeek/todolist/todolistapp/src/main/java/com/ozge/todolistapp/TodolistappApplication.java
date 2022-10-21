package com.ozge.todolistapp;

import com.ozge.todolistapp.entity.Todo;
import com.ozge.todolistapp.entity.User;
import com.ozge.todolistapp.repository.TodoRepository;
import com.ozge.todolistapp.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Locale;

@SpringBootApplication
public class TodolistappApplication implements CommandLineRunner {

	private final UserRepository userRepository;
	private final TodoRepository todoRepository;

	public TodolistappApplication(UserRepository userRepository, TodoRepository toDoRepository) {
		this.userRepository = userRepository;
		this.todoRepository = toDoRepository;
	}



	public static void main(String[] args) {
		SpringApplication.run(TodolistappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String date1 ="01-Jan-2022";
		String date2 = "02-Feb-2022";

		DateTimeFormatter df = new DateTimeFormatterBuilder()
				// case insensitive to parse JAN and FEB
				.parseCaseInsensitive()
				// add pattern
				.appendPattern("dd-MMM-yyyy")
				// create formatter (use English Locale to parse month names)
				.toFormatter(Locale.ENGLISH);
		LocalDate  d1 = LocalDate.parse(date1, df);
		LocalDate  d2 = LocalDate.parse(date2, df);

		User user = User.builder()
				.Name("ozge")
				.Surname("katirci")
				.toDoList(new ArrayList<>())
				.build();

		User user1 = User.builder()
				.Name("melisa")
				.Surname("sarı")
				.toDoList(new ArrayList<>())
				.build();
		Todo todo= Todo.builder()
				.title("okul")
				.content("sabah 9'da derse gidilecek.")
				.taskDate(d2)
				.build();
		Todo todo1= Todo.builder()
				.title("aile")
				.content("akşam yemeği 7'de dışarda yenilecek.")
				.taskDate(d1)
				.build();

		user.getToDoList().add(todo);
		user1.getToDoList().add(todo1);
		todoRepository.save(todo);
		todoRepository.save(todo1);
		userRepository.save(user);
		userRepository.save(user1);



	}
}
