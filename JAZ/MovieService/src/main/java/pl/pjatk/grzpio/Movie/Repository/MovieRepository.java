package pl.pjatk.grzpio.Movie.Repository;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import pl.pjatk.grzpio.Movie.Model.Movie;

import java.util.List;
@Getter
@Repository
public class MovieRepository {
    private List<Movie> movies;

    public MovieRepository(List<Movie> movies) {
        this.movies = createRepository();
    }

    

    public List<Movie> createRepository(){
    }
}
