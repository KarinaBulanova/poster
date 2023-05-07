package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void mustShowAllFilms() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void mustShowOneMovie() {
        MovieManager manager = new MovieManager();

        manager.add("Movie 1");


        String[] actual = manager.findAll();
        String[] expected = {"Movie 1"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldShowTheFieldWithoutFilms() {
        MovieManager manager = new MovieManager();


        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }


    @Test
    public void shouldShowMoviesInReverseOrder() {
        MovieManager manager = new MovieManager(3);

        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");


        String[] actual = manager.findLast();
        String[] expected = {"Movie 5", "Movie 4", "Movie 3"};

        Assertions.assertArrayEquals(actual, expected);
    }


}
