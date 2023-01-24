public class Vehicle implements IEngine,IGearbox,ITyres {
    private VehicleType vehicleType;
    private double price;
    private String color;
    private double engine;

    public Vehicle(VehicleType vehicleType, double price, String color, double engine) {
        this.vehicleType = vehicleType;
        this.price = price;
        this.color = color;
        this.engine = engine;
    }

    public String getVehicleType() {
        return vehicleType.getType();
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getEngine() {
        return engine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String engine(){
        return "Me engine, me vroom";
    }

    public  int tyres(){
        return 4;
    }

    public String gearbox(){
        return "automatic";
    }
}
