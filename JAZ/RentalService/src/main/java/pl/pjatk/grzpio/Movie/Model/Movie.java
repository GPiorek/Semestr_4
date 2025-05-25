package pl.pjatk.grzpio.Movie.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import pl.pjatk.grzpio.Movie.Enum.MovieCategory;
import pl.pjatk.grzpio.Movie.Enum.Pegi;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private int id;
    private String title;
    private MovieCategory category;
    private Pegi pegi;
    private int yearOfRelease;
    private double duration;
    private boolean isAvailable = false;


}