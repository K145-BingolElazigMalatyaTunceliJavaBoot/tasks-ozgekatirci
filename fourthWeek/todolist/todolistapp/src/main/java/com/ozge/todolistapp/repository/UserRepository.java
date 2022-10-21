package com.ozge.todolistapp.repository;

import com.ozge.todolistapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
