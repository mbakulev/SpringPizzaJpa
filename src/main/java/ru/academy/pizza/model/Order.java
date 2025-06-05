package ru.academy.pizza.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
    private List<Dish> items;
    private String customerName;

     public String getDishes() {
         StringBuilder stringBuffer = new StringBuilder();

         for (Dish dish: items) {
            stringBuffer.append(dish.getName()).append("; ");
         }

         return stringBuffer.toString();
     }
    // constructor, getters
}
