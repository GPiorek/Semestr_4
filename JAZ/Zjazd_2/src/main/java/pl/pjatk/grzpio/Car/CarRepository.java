package pl.pjatk.grzpio.Car;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {
    final List<Car> cars;

    private List<Car> addCars() {
        Car exampleCar = new Car(1, 300, "Seat");
        cars.add(exampleCar);
        return cars;
    }

    public CarRepository(List<Car> cars, List<Car> addCars) {
        this.cars = cars;
    }


}
