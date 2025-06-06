package Techmm;

public class ElectricCar extends Car {
    private int batteryRange;

    ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange() {
        return batteryRange;
    }
    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }
    public void chargeBattery() {
        System.out.println("Battery is being charged");
    }
    @Override
    public void startEngine() {
        System.out.println("Electric car is running");
    }
}
