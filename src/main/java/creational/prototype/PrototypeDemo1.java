package creational.prototype;

public class PrototypeDemo1 {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie)registry.createItem("Movie");
        movie.setTitle("Creational pattern in Java");

        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());


    }
}
