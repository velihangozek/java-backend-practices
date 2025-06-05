package org.velihangozek.service;

import org.velihangozek.model.Order;
import org.velihangozek.model.Product;
import org.velihangozek.model.User;

import java.util.*;

public class OrderService {

    private static Map<User, List<Order>> orderMapByUsers = new HashMap<>();

    public void create(List<Product> productList, User user) {
        Order order = new Order(productList, user);
        List<Order> orderListByUser = findOrders(user);
        if (orderListByUser == null) {
            orderListByUser = new ArrayList<>();
        }
        orderListByUser.add(order);
        orderMapByUsers.put(user, orderListByUser);
        user.getOrderList().add(order);
        System.out.println("Order created! => " + order);
    }

    public void list() {
        for (List<Order> orderList : orderMapByUsers.values()) {
            System.out.println(orderList);
        }
    }

    public List<Order> findOrders(User user) {
        return orderMapByUsers.get(user);
    }

}