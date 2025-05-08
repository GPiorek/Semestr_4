package pl.pjatk.grzpio.Movie.Service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pjatk.grzpio.Movie.Model.Movie;
import pl.pjatk.grzpio.Movie.Repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private final Movie movie;
    private MovieRepository movieRepository;

    public MovieService(Movie movie, MovieRepository movieRepository) {
        this.movie = movie;
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElse(null);
    }

    public boolean checkIfMovieExists(int id) {
        return movieRepository.existsById(id);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public void addMovieWithId(int id, Movie movie) {
        movie.setId(id);
        movieRepository.save(movie);
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(int id, Movie movie) {
        movieRepository.findById(id);
        if (movie.getId() != id) {
            return null;
        } else {
            movieRepository.deleteById(id);
            return movieRepository.save(movie);
        }
    }


}
