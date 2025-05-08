package pl.pjatk.grzpio.Movie.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import pl.pjatk.grzpio.Movie.Enum.MovieCategory;
import pl.pjatk.grzpio.Movie.Enum.Pegi;

@Component
@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Enumerated(EnumType.STRING)
    private MovieCategory category;
    @Enumerated(EnumType.STRING)
    private Pegi pegi;
    private int yearOfRelease;
    private double duration;


}
