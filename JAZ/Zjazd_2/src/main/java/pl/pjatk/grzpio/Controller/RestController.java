package pl.pjatk.grzpio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/test/hello")
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping
    public ResponseEntity<String> helloMessage(){
        return ResponseEntity.ok("Hello World");
    }
}
