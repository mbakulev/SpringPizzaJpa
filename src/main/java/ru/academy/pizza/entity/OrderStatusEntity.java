package ru.academy.pizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_status")
public class OrderStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_status_id_seq")
    @SequenceGenerator(name = "order_status_id_seq", sequenceName = "order_status_id_seq", allocationSize = 1)
    private Long id;
    private String name;
}
