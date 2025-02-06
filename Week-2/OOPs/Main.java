package Techmm;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
     Car car1 = new Car("Hyundai","i10",2007);
        Car car2 = new Car("Hyundai","i20",2008);
        Car car3 = new Car("Hyundai","i30",2007);
        Car car4 = new ElectricCar("Tesla","Model S",2012,400);
        Car car5 = new ElectricCar("Tesla","Model X",2012,329);
        Car car6 = new ElectricCar("Tesla","Model X Plaid",2012,314);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        for(Car car : cars) {
            car.startEngine();
        }
  }
}
    
