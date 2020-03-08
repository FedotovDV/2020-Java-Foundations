package enums;

import java.util.*;

public class MovieRunner {
    public static void main(String[] args) {
        //HW: 1. Enums Передать в Жанры фильмов оценку от 1 до 5 через конструктор.
//    И выводить сообщение в зависимости от жанра с помощью метода.
//            ("Хороший жанр", "Можно посмотреть", "Ни за что на свете")
//    Создать список из 10 фильмов.
//    И вывести только те фильмы, оценка жанров которых больше 3.

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Побег из Шоушенка", Genre.TRAGEDY));
        movies.add(new Movie("Криминальное чтиво", Genre.THRILLER));
        movies.add(new Movie("Назад в будущее", Genre.FANTASTIC));
        movies.add(new Movie("Матрица", Genre.FANTASTIC));
        movies.add(new Movie("Титаник", Genre.TRAGEDY));
        movies.add(new Movie("Шоу Трумана", Genre.COMEDY));
        movies.add(new Movie("Пятый элемент", Genre.FANTASTIC));
        movies.add(new Movie("Тихое место", Genre.HORRORS));
        movies.add(new Movie("Алита: Боевой ангел", Genre.FANTASTIC));
        movies.add(new Movie("Обратный отсчет", Genre.HORRORS));


        for (Movie movie : movies) {
            if (movie.getGenre().getRating() > 3) {
                System.out.println(movie + " " + getRatingGenre(movie.getGenre()));
            }
        }
    }

    public static String getRatingGenre(Genre genre) {
        if (genre.getRating() < 3) {
            return "Ни за что на свете";
        } else if (genre.getRating() < 4) {
            return "Можно посмотреть";
        } else {
            return "Хороший жанр";
        }
    }

}
