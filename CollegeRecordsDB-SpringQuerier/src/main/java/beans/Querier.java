package beans;

public class Querier {
    private String query;

    public Querier(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "Querier{" +
                "query='" + query + '\'' +
                '}';
    }
}
