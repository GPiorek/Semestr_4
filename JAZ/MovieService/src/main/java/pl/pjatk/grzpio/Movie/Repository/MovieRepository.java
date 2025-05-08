package pl.pjatk.grzpio.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.grzpio.Movie.Model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {


}
