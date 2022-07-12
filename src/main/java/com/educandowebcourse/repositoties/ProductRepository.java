package com.educandowebcourse.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebcourse.entities.Product;

public interface  ProductRepository extends JpaRepository<Product, Long> {

}
