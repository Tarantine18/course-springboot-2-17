package com.educandowebcourse.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebcourse.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Long> {

}
