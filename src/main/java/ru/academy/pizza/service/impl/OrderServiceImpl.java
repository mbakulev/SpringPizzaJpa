package ru.academy.pizza.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.pizza.entity.OrderEntity;
import ru.academy.pizza.repository.OrderRepository;
import ru.academy.pizza.service.OrderService;

import java.util.Collection;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void showOrders() {
        Collection<OrderEntity> orders = orderRepository.findAll();
        orders.forEach(System.out::println);
    }

    @Override
    public void showOrder(Long orderId) {
        Optional<OrderEntity> order = orderRepository.findById(orderId);
        order.ifPresent(System.out::println);
    }

    @Override
    public void createOrder() {

    }
}
