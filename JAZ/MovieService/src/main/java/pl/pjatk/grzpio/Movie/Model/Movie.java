package pl.pjatk.grzpio.Movie.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.stereotype.Component;
import pl.pjatk.grzpio.Movie.Enum.MovieCategory;
import pl.pjatk.grzpio.Movie.Enum.Pegi;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String title;
    @NonNull
    @Enumerated(EnumType.STRING)
    private MovieCategory category;
    @NonNull
    @Enumerated(EnumType.STRING)
    private Pegi pegi;
    private int yearOfRelease;
    private double duration;


}
