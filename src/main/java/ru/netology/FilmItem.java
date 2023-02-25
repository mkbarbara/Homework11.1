package ru.netology;

public class FilmItem {
    private String filmName;
    private String filmClass;
    private String filmUrl;

    public FilmItem(String filmName, String filmClass, String filmUrl) {
        this.filmName = filmName;
        this.filmClass = filmClass;
        this.filmUrl = filmUrl;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmClass() {
        return filmClass;
    }

    public String getFilmUrl() {
        return filmUrl;
    }
}
