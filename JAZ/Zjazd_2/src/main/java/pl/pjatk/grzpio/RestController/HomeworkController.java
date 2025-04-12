package pl.pjatk.grzpio.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.grzpio.Car.Car;
import pl.pjatk.grzpio.Car.CarService;
import pl.pjatk.grzpio.HomeworkEntity;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    private final CarService carService;
    public HomeworkController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{var}")
    public ResponseEntity<HomeworkEntity> getVar(@PathVariable String var) {
        return ResponseEntity.ok(new HomeworkEntity(var));
    }

    @GetMapping("/getParam")
    public ResponseEntity<HomeworkEntity> getRP(@RequestParam(value = "var") String var) {
        return ResponseEntity.ok(new HomeworkEntity(var));
    }

    @GetMapping("/CarList")
    public List<Car> getCarList() {
        return carService.getCars();
    }

    @PostMapping("/AddCar")
    public ResponseEntity<Car> addCar(@RequestBody Car car) {
        carService.addCar(car);
        return ResponseEntity.ok(car);
    }

    @PutMapping("/updateCar/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable int id) {
        carService.updateCar(car, id);
    }

    @DeleteMapping("/deleteCar/{id}")
    public void deleteCar(@PathVariable int id) {
        carService.removeCar(id);
    }

    @GetMapping("/hello/ex")
    public ResponseEntity<String> exception(){
        throw new RuntimeException("First exercise");
    }
}


