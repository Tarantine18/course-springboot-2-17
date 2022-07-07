package com.educandowebcourse.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebcourse.entities.User;

public interface  UserRepository extends JpaRepository<User, Long> {

}
