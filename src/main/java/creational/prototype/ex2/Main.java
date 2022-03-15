package creational.prototype.ex2;

import creational.prototype.ex2.products.Book;
import creational.prototype.ex2.products.Game;
import creational.prototype.ex2.products.Movie;
import creational.prototype.ex2.products.ProductType;

public class Main {
    public static void main(String[] args) {
        ShopRegistry shopRegistry = new ShopRegistry();

        Book book = (Book) shopRegistry.createProduct(ProductType.BOOK);
        Movie movie = (Movie) shopRegistry.createProduct(ProductType.MOVIE);
        Game game = (Game) shopRegistry.createProduct(ProductType.GAME);

        book.setPrice(15.99);
        movie.setName("Die Hard 2");
        game.setDeveloper("Bethesda Softworks");

        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getAuthor());
        System.out.println();

        System.out.println(movie.getName());
        System.out.println(movie.getPrice());
        System.out.println(movie.getDirector());
        System.out.println();

        System.out.println(game.getName());
        System.out.println(game.getPrice());
        System.out.println(game.getDeveloper());
    }
}
