package org.velihangozek.model;

import org.velihangozek.model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList;
    private OrderStatus orderStatus;
    private User user;
    private LocalDateTime createdDateTime;
    private LocalDateTime canceledDateTime;
    private Double total;

    public Order(List<Product> productList, User user) {
        this.user = user;
        this.productList = productList;
        this.orderStatus = OrderStatus.PREPARING;
        this.createdDateTime = LocalDateTime.now();
        this.canceledDateTime = null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void cancelOrder(Order order) {
        order.setOrderStatus(OrderStatus.CANCELED);
        order.canceledDateTime = LocalDateTime.now();
    }

    public Double getTotal() {
        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", orderStatus=" + orderStatus +
                // ", user=" + user +
                ", createdDateTime=" + createdDateTime +
                ", canceledDateTime=" + canceledDateTime +
                ", total=" + getTotal() +
                '}';
    }
}