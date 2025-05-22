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
public class MovieRestController {

    private final MovieService movieService;
    private final MovieRepository movieRepository;

    public MovieRestController(MovieService movieService, MovieRepository movieRepository) {
        this.movieService = movieService;
        this.movieRepository = movieRepository;
    }

    @GetMapping()
    public ResponseEntity<List<Movie>> getMovies() {
        return ResponseEntity.ok(movieRepository.findAllBy());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable int id) {
//        return ResponseEntity.ok(movieService.getMovieById(id));
//        if (movieService.getMovieById(id) != null) {
//            return ResponseEntity.ok(movieService.getMovieById(id));
//        } else {
//            return ResponseEntity.notFound().build();
//        }
        if (movieRepository.findMovieById(id) != null) {
            return ResponseEntity.ok(movieRepository.findMovieById(id));
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
        if (movieRepository.existsById(id)) {
            movieService.addMovieWithId(id, movie);
            return ResponseEntity.ok(movie);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable int id) {
        if (movieRepository.existsMovieById(id)) {
            movieRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/setAvailability/{id}")
    public ResponseEntity<Movie> setTrueAvailability(@PathVariable int id) {
        if (movieRepository.existsMovieById(id)) {
            movieService.updateAvailability(movieService.getMovieById(id));
            return ResponseEntity.ok().build();
        }else
            return ResponseEntity.notFound().build();
    }
}
