package enums;

public enum Genre {
    COMEDY ("Комедия", 4),
    THRILLER("Триллер", 4),
    TRAGEDY("Драмма", 3),
    HORRORS("Ужасы", 2),
    FANTASTIC("Фантастика", 5);

    private String title;
    private int rating;

    Genre(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }


}
