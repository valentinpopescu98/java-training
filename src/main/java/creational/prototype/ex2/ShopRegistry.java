package creational.prototype.ex2;

import creational.prototype.ex2.products.*;

import java.util.HashMap;

public class ShopRegistry {
    HashMap<ProductType, Product> products = new HashMap<>();

    public ShopRegistry() {
        loadRegistry();
    }

    public Product createProduct(ProductType type) {
        Product product = null;
        try {
            product = (Product) products.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }

    private void loadRegistry() {
        Book book = new Book();
        book.setName("Mobby Dick");
        book.setPrice(14.99);
        book.setAuthor("Herman Melville");

        Movie movie = new Movie();
        movie.setName("Die Hard");
        movie.setPrice(19.99);
        movie.setDirector("John McTiernan");

        Game game = new Game();
        game.setName("Doom");
        game.setPrice(60);
        game.setDeveloper("Id Software");

        products.put(ProductType.BOOK, book);
        products.put(ProductType.MOVIE, movie);
        products.put(ProductType.GAME, game);
    }
}
