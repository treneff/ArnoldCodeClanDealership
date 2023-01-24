import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money, ArrayList<Vehicle> ownedVehicles) {
        this.money = money;
        this.ownedVehicles = ownedVehicles;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
