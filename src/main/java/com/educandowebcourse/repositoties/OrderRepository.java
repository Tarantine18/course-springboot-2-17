package com.educandowebcourse.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebcourse.entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {

}
