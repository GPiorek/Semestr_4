package pl.pjatk.grzpio.Car;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void printCars() {
        System.out.println(carRepository.cars);
    }

    public void addCar(Car car) {
        carRepository.cars.add(car);
    }

    public void removeCar(int id) {
        carRepository.cars.remove(id);
    }


    public List<Car> getCars() {
        return carRepository.cars;
    }

    public void updateCar(Car car, int id) {
        carRepository.cars.set(id, car);
    }
}
