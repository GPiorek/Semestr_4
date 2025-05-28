package pl.pjatk.grzpio.Movie.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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