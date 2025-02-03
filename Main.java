package Techmm;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer cus=new Customer("Alla", 35,355);
        Product pro=new Product("Apple", 15,155);
        Product pro1=new Product("Banana", 15,155);
        Product pro2=new Product("Grapes", 15,155);
        List<Product> products=new ArrayList<Product>();
        products.add(pro1);
        products.add(pro2);
        Order or=new Order(cus, products);
        or.display();
//        Application app = new Calculator();
//        app.read();
//        app.calculate();
    }
}
