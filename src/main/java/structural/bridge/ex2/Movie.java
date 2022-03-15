package structural.bridge.ex2;

public class Movie {
    private String name;
    private String year;
    private String classification;

    public Movie(String name, String year, String classification) {
        this.name = name;
        this.year = year;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getClassification() {
        return classification;
    }
}
