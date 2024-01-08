package model.order;

import model.product.Product;

public class OrderDetail {

    private Integer id;

    private Double price;

    private Order order;

    private Product product;

    public OrderDetail() {
    }

    public OrderDetail(Integer id, Double price, Order order, Product product) {
        this.id = id;
        this.price = price;
        this.order = order;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
