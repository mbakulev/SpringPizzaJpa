package ru.academy.pizza.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"order\"")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
    @SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", allocationSize = 1)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private OrderStatusEntity status;
    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Collection<OrderItemEntity> items = new ArrayList<>();
    private BigDecimal totalOrderAmount;
}
