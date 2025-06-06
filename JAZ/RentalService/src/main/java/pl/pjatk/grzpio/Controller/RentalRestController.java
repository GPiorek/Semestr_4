package pl.pjatk.grzpio.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.grzpio.Movie.Model.Movie;
import pl.pjatk.grzpio.RentalService;

@RequestMapping("/RentalService")
@RestController
public class RentalRestController {

    private final RentalService rentalService;

    public RentalRestController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/getMovie/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {;
        return ResponseEntity.ok(rentalService.getMovieFromMovieService(id));
    }

    @PostMapping("/statusHandler")
    public ResponseEntity<HttpStatus> statusHandler(@RequestBody HttpStatus status){
        System.out.println(status);
    return ResponseEntity.status(status).build();
    }

}
