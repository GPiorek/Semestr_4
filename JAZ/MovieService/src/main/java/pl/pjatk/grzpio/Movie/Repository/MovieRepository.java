package pl.pjatk.grzpio.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.grzpio.Movie.Model.Movie;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    Movie findMovieById(int id);

    List<Movie> findAllBy();

    boolean existsMovieById(int id);



}

