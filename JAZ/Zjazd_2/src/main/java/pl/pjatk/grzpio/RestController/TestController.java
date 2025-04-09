package pl.pjatk.grzpio.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.grzpio.Model.Car;


@RequestMapping("/test")
@org.springframework.web.bind.annotation.RestController
public class TestController {

    @GetMapping("/helloWorld")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> returnCarObject() {
        Car car = new Car(10, "Civic");
        return ResponseEntity.ok(car);
    }

    @GetMapping("{someValue}")
    public ResponseEntity<String> returnValue(@PathVariable(value = "someValue") String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> returnAnotherValue(@RequestParam(value = "reqParam") String reqParam) {
        return ResponseEntity.ok(reqParam);
    }


    @PostMapping("/model")
    public ResponseEntity<Object> returnNewObject(@RequestBody Car car) {
        return ResponseEntity.ok(car.getMileage() + "\n" + car.getModel());
//KOD JSON
//        {
//            "mileage":"20",
//                "model":"Civic"
//        }
    }
}
