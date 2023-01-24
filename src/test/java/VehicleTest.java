import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    Vehicle vehicle;
    @Before
    public void before(){
        vehicle = new Vehicle(VehicleType.HYBRID, 5000, "green",1.8);
    }

    @Test
    public void hasType(){
        assertEquals("Hybrid", vehicle.getVehicleType());
    }

    @Test
    public void hasPrice(){
        assertEquals(5000, vehicle.getPrice(),0);
    }

    @Test
    public void hasColor(){
        assertEquals("green", vehicle.getColor());
    }

    @Test
    public void hasEngine(){
        assertEquals(1.8, vehicle.getEngine(),0);
    }

    @Test
    public void canSetPrice(){
        vehicle.setPrice(3000);
        assertEquals(3000,vehicle.getPrice(),0);
    }

    @Test
    public void carHasGearbox(){
        assertEquals("automatic", vehicle.gearbox());
    }

    @Test
    public void carHasEngine(){
        assertEquals("Me engine, me vroom", vehicle.engine());
    }

    @Test
    public void carHasTyres(){
        assertEquals(4,vehicle.tyres());
    }

}
