import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> hybridVehicles;
    private ArrayList<Vehicle> electricVehicles;
    private ArrayList<Vehicle> petrolVehicles;
    private ArrayList<Vehicle> dieselVehicles;

    private double till;


    public Dealership(double till) {
        this.hybridVehicles = new ArrayList<>();
        this.electricVehicles = new ArrayList<>();
        this.petrolVehicles = new ArrayList<>();
        this.dieselVehicles = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Vehicle> getHybridVehicles() {
        return hybridVehicles;
    }

    public ArrayList<Vehicle> getElectricVehicles() {
        return electricVehicles;
    }

    public ArrayList<Vehicle> getPetrolVehicles() {
        return petrolVehicles;
    }

    public ArrayList<Vehicle> getDieselVehicles() {
        return dieselVehicles;
    }


    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public int getAmountOfHybrids() {
        return this.hybridVehicles.size();
    }
    public int getAmountOfPetrols() {
        return this.petrolVehicles.size();
    }
    public int getAmountOfDiesels() {
        return this.dieselVehicles.size();
    }
    public int getAmountOfElectrics() {
        return this.electricVehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        if(vehicle.getVehicleType() == "Hybrid"){
            this.hybridVehicles.add(vehicle);
        }
        if(vehicle.getVehicleType() == "Petrol"){
            this.petrolVehicles.add(vehicle);
        }
        if(vehicle.getVehicleType() == "Electric"){
            this.electricVehicles.add(vehicle);
        }
        if(vehicle.getVehicleType() == "Diesel"){
            this.dieselVehicles.add(vehicle);
        }
    }

    public void buyVehicle(Vehicle vehicle) {
        if(till >= vehicle.getPrice()){
            this.addVehicle(vehicle);
            this.setTill(this.till - vehicle.getPrice());
        }
    }


}
