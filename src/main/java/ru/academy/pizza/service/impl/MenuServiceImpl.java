package ru.academy.pizza.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.academy.pizza.entity.DishEntity;
import ru.academy.pizza.entity.KitchenEntity;
import ru.academy.pizza.repository.DishRepository;
import ru.academy.pizza.repository.KitchenRepository;
import ru.academy.pizza.service.MenuService;

import java.util.Collection;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private KitchenRepository kitchenRepository;
    @Autowired
    private DishRepository dishRepository;

    @Override
    public void showMenu() {
        Collection<KitchenEntity> kitchenEntities = kitchenRepository.findAll();

        kitchenEntities.forEach(kitchenEntity -> {
            System.out.println(kitchenEntity.getName());
            System.out.println(kitchenEntity.getDishes());
            //Collection<DishEntity> dishEntities = dishRepository.findAll();
        });
    }

    @Override
    public void showMenu(String menuName) {

    }
}
