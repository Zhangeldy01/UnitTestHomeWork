package HomeWork2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp(){
        car = new Car("Volvo", "XC90", 2021);
        motorcycle = new Motorcycle("BMW", "S 1000 RR", 2020);
    }
    @Test
    @DisplayName("Автомобиль это транспортное средство")
    public void carIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Автомобиль имеет четыре колеса")
    public void carHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Мотоцикл имеет два колеса")
    public void motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Скорость тестовой поездки автомобиля составляет 60 км/ч")
    public void carTestDriveSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("Скорость тестовой поездки мотоцикла составляет 75 км/ч")
    public void motorcycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("Скорость автомобиля в режиме парковки")
    public void carParkSpeed() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("Скорость мотоцикла в режиме парковки")
    public void motorcycleParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
