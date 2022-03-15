package structural.bridge.ex2.printers;

import structural.bridge.ex2.Detail;
import structural.bridge.ex2.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {
    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Title", movie.getName()));
        details.add(new Detail("Year", movie.getYear()));
        details.add(new Detail("Classification", movie.getClassification()));

        return details;
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
