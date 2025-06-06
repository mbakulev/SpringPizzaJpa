package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.academy.pizza.entity.DishEntity;

public interface DishRepository extends JpaRepository<DishEntity, Long> {
}
