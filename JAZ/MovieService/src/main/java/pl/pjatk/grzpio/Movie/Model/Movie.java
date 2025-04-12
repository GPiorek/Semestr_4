package pl.pjatk.grzpio.Movie.Model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;
import pl.pjatk.grzpio.FilmCategory;

@Getter
@Setter

@Component
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private FilmCategory filmCategory;

}
