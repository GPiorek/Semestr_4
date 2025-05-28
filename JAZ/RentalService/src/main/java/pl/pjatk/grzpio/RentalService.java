package pl.pjatk.grzpio;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
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

    public void setMovieAvailabilityTrue(int id) {
        restTemplate.postForObject("http://localhost:8080/movies/setAvailabilityTrue/" + id, null, Void.class);
        //restTemplate.exchange("http://localhost:8080/movies/setAvailabilityTrue/" + id, HttpMethod.PATCH, );
    }

    public void setMovieAvailabilityFalse(int id) {
        restTemplate.postForObject("http://localhost:8080/movies/setAvailabilityFalse/" + id, null, Void.class);
        //restTemplate.exchange("http://localhost:8080/movies/setAvailabilityTrue/" + id, HttpMethod.PATCH, );
    }
}
