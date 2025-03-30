package pl.pjatk.grzpio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.grzpio.Model.Car;


@RequestMapping("/test")
@org.springframework.web.bind.annotation.RestController
public class HelloMessageController {

    @GetMapping("/helloWorld")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/car")
    public ResponseEntity<Car> returnCarObject(){
    Car car = new Car();
    car.setMileage(10);
    car.setModel("Civic");
        return ResponseEntity.ok(car);
    }

    @GetMapping("{someValue}")
    public ResponseEntity<String> returnValue(@PathVariable(value="someValue") String someValue){
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> returnAnotherValue(@RequestParam(value="reqParam") String reqParam){
        return ResponseEntity.ok(reqParam);
    }
    @ResponseBody
    @GetMapping("/model")
    public ResponseEntity<Object> returnNewObject(){

    }
}
