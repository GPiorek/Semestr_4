package pl.pjatk.grzpio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
