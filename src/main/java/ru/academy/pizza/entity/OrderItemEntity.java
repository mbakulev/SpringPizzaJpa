package ru.academy.pizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_items")
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_items_id_seq")
    @SequenceGenerator(name = "order_items_id_seq", sequenceName = "order_items_id_seq", allocationSize = 1)
    private Long id;
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private OrderEntity order;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_id", nullable = false)  // Foreign key column
//    private OrderEntity order;
    private Long orderId;
    @ManyToOne
    @JoinColumn(name = "dish_id")
    private DishEntity dish;
    private int quantity;
}
