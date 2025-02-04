package Techmm;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    public double total=0.0;
    Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.total=calculate();
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<Product> getProducts() {
        return products;
    }
    public double calculate() {
        for (Product p : products) {
            total=total+ p.getProductprice();
        }
        return total;
    }
    public void display() {
        customer.displaydetails();
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("Total Amount= "+total);
    }

}
