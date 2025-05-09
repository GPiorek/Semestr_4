package pl.pjatk.grzpio.Movie.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.grzpio.Movie.Model.Movie;
import pl.pjatk.grzpio.Movie.Repository.MovieRepository;
import pl.pjatk.grzpio.Movie.Service.MovieService;

import java.util.List;

//todo exceptions jak w zadaniach
@RequestMapping("/movies")
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final MovieService movieService;


    public RestController(MovieService movieService, MovieRepository movieRepository) {
        this.movieService = movieService;
    }

    @GetMapping()
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable int id) {
//        return ResponseEntity.ok(movieService.getMovieById(id));
        if (movieService.getMovieById(id) != null) {
            return ResponseEntity.ok(movieService.getMovieById(id));
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return ResponseEntity.ok(movie);
    }

    @PutMapping("{id}") //TODO DO POPRAWY
    public ResponseEntity<Movie> updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        if (movieService.checkIfMovieExists(id)) {
            movieService.addMovieWithId(id, movie);
            return ResponseEntity.ok(movie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        if (movieService.checkIfMovieExists(id)) {
            movieService.deleteMovie(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
