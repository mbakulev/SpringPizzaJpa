package ru.academy.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.academy.pizza.config.ConfigPizza;
import ru.academy.pizza.customerService.CustomerService;
import ru.academy.pizza.model.MargaritaPizza;
import ru.academy.pizza.model.Order;
import ru.academy.pizza.model.Pizza;

import ru.academy.pizza.service.MenuService;
import ru.academy.pizza.service.OrderService;

import java.util.List;

@SpringBootApplication
public class PizzeriaApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ConfigPizza configPizza;

    @Autowired
    private OrderService orderService;

    @Autowired
    private MenuService menuService;

    public static void main(String[] args) {
        SpringApplication.run(PizzeriaApplication.class, args);
    }

    @Override
    public void run(String... args) {

        orderService.showOrders();
        menuService.showMenu();

//        Order order1 = new Order(
//                List.of(
//                        new MargaritaPizza(Pizza.Size.MEDIUM, configPizza),
//                        new MargaritaPizza(Pizza.Size.LARGE, configPizza)
//                ),
//                "Иван Иванов"
//        );
//
//        customerService.placeOrder(order1);

    }
}