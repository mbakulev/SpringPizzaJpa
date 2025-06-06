package ru.academy.pizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kitchen")
public class KitchenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kitchen_id_seq")
    @SequenceGenerator(name = "kitchen_id_seq", sequenceName = "kitchen_id_seq", allocationSize = 1)
    private Long id;
    private String name;
}
