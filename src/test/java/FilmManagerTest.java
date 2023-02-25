import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmItem;
import ru.netology.FilmManager;

public class FilmManagerTest {

    FilmItem item1 = new FilmItem("Бладшот", "боевик", "111");
    FilmItem item2 = new FilmItem("Вперед", "мультфильм", "112");
    FilmItem item3 = new FilmItem("Отель Белград", "комедия", "113");
    FilmItem item4 = new FilmItem("Джентельмены", "боевик", "114");
    FilmItem item5 = new FilmItem("Человек-невидимка", "ужасы", "115");
    FilmItem item6 = new FilmItem("Тролли", "мультфильм", "116");
    FilmItem item7 = new FilmItem("Номер один", "комедия", "117");

    @Test
    public void shouldAddItems() {
        FilmManager manager = new FilmManager();

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        FilmItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        FilmItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItems() {
        FilmManager manager = new FilmManager();

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        FilmItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItemsWithLimit() {
        FilmManager manager = new FilmManager(5);

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        FilmItem[] expected = {item7, item6, item5, item4, item3};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReverseAllItemsLimitMoreAmount() {
        FilmManager manager = new FilmManager(12);

        manager.save(item1);
        manager.save(item2);
        manager.save(item3);
        manager.save(item4);
        manager.save(item5);
        manager.save(item6);
        manager.save(item7);

        FilmItem[] expected = {item7, item6, item5, item4, item3, item2, item1};
        FilmItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
