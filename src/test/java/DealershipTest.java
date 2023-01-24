import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Vehicle vehicle;
    @Before
    public void before(){
        dealership = new Dealership(50000);
        vehicle = new Vehicle(VehicleType.HYBRID, 5000, "green",1.8);
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getAmountOfHybrids());
    }


    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(vehicle);
        assertEquals(45000, dealership.getTill(),0);
        assertEquals(1, dealership.getAmountOfHybrids());
    }

    
}
