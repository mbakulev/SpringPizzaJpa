package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.academy.pizza.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
