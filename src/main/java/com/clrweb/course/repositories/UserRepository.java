package com.clrweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clrweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
