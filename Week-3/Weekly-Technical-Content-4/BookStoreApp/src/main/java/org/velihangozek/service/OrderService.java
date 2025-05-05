package org.velihangozek.service;

import org.velihangozek.model.Order;
import org.velihangozek.model.Product;
import org.velihangozek.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OrderService {

    private static List<Order> orderList = new ArrayList<>();

    public void create(List<Product> productList, User user) {
        Order order = new Order(productList, user);
        orderList.add(order);
    }

    public void list() {
        for (Order order : orderList) {
            System.out.println(order);
        }
    }


}
