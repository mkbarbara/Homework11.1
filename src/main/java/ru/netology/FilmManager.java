package ru.netology;

public class FilmManager {
    private FilmItem[] items = new FilmItem[0];
    private int numberFilm;

    public FilmManager() {
        numberFilm = 10;
    }

    public FilmManager(int numberFilm) {
        this.numberFilm = numberFilm;
    }

    public void save(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i += 1) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public FilmItem[] findLast() {
        int resultLength;
        if (numberFilm < items.length) {
            resultLength = numberFilm;
        } else {
            resultLength = items.length;
        }

        FilmItem[] reversed = new FilmItem[resultLength];
        for (int i = 0; i < reversed.length; i += 1) {
            reversed[i] = items[items.length-1-i];
        }
        return reversed;
    }
}
