package pl.pjatk.grzpio;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.grzpio.Movie.Model.Movie;


@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie getMovieFromMovieService(int id) {
        return restTemplate.getForObject("http://localhost:8080/movies/" + id, Movie.class);
    }

}
