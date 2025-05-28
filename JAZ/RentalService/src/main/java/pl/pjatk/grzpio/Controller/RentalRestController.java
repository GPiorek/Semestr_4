package pl.pjatk.grzpio.Controller;

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
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        return ResponseEntity.ok(rentalService.getMovieFromMovieService(id));
    }

    @PostMapping("/setMovieAvailabilityTrue/{id}")
    public void setMovieAvailabilityTrue(@PathVariable int id) {
        rentalService.setMovieAvailabilityTrue(id);
    }

    @PostMapping("/setMovieAvailabilityFalse/{id}")
    public void setMovieAvailabilityFalse(@PathVariable int id) {
        rentalService.setMovieAvailabilityFalse(id);
    }
}
