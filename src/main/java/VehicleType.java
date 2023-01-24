public enum VehicleType {
    HYBRID("Hybrid"),
    ELECTRIC("Electric"),
    PETROL("Petrol"),
    DIESEL("Diesel");

    private final String type;

    VehicleType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
