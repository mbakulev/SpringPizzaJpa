package ru.academy.pizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dish")
public class DishEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dish_id_seq")
    @SequenceGenerator(name = "dish_id_seq", sequenceName = "dish_id_seq", allocationSize = 1)
    private Long id;
    private String name;
//    @ManyToOne
//    @JoinColumn(name = "kitchen_id")
//    private KitchenEntity kitchen;
    private Long kitchenId;
    private double price;
}
