import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void testFindAllFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII"};
        String[] actual = manager.findAll();
    }

    @Test
    public void testFindAllFilmsWithoutAdding() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");

        String[] expected = {};
        String[] actual = manager.findAll();
    }

    @Test
    public void testFindLastFilmsLimit() {
        FilmManager manager = new FilmManager(10);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testFindLastFilmsLessThanLimit() {
        FilmManager manager = new FilmManager(5);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V"};
        String[] actual = manager.findLast();
    }

    @Test
    public void testFindLastFilmsOverLimit() {
        FilmManager manager = new FilmManager(10);

        manager.addFilm("Film I");
        manager.addFilm("Film II");
        manager.addFilm("Film III");
        manager.addFilm("Film IV");
        manager.addFilm("Film V");
        manager.addFilm("Film VI");
        manager.addFilm("Film VII");
        manager.addFilm("Film VIII");
        manager.addFilm("Film IX");
        manager.addFilm("Film X");
        manager.addFilm("Film XI");

        String[] expected = {"Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII", "Film IX", "Film X", "Film XI"};
        String[] actual = manager.findLast();
    }

}
