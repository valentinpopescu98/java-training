package structural.bridge.ex2;

import structural.bridge.ex2.formatters.FancyFormatter;
import structural.bridge.ex2.formatters.SimpleFormatter;
import structural.bridge.ex2.printers.MoviePrinter;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Die Hard", "1993", "Action");
        MoviePrinter moviePrinter = new MoviePrinter(movie);

        String printedString = moviePrinter.print(new SimpleFormatter());
        System.out.println(printedString);

        String printedString2 = moviePrinter.print(new FancyFormatter());
        System.out.println(printedString2);
    }
}
