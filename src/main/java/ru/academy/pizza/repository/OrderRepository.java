package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.academy.pizza.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
