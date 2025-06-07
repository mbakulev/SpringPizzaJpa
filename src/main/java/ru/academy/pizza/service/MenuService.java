package ru.academy.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.academy.pizza.repository.KitchenRepository;

public interface MenuService {
    void showMenu();
    void showMenu(String menuName);
}
