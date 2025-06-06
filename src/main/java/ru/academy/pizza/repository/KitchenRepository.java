package ru.academy.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.academy.pizza.entity.KitchenEntity;

public interface KitchenRepository extends JpaRepository<KitchenEntity, Long> {
}
