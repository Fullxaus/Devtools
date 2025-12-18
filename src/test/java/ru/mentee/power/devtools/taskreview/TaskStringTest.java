package ru.mentee.power.devtools.taskreview;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TaskStringTest {

    @Test
    public void testAnimals() {
        TaskString taskString = new TaskString();
        String[] expected = {"Tom", "Billy", "Mimi", "Rex", "Bob", "Tom"};
        String[] actual = taskString.animals(taskString.cat, taskString.dog);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAnimalsEmptyArrays() {
        TaskString taskString = new TaskString();
        String[] cat = {};
        String[] dog = {};
        String[] expected = {};
        String[] actual = taskString.animals(cat, dog);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAnimalsOneEmptyArray() {
        TaskString taskString = new TaskString();
        String[] cat = {"Tom", "Billy", "Mimi"};
        String[] dog = {};
        String[] expected = {"Tom", "Billy", "Mimi"};
        String[] actual = taskString.animals(cat, dog);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAnimalsEquals_TomFound() {
        TaskString taskString = new TaskString();
        String[] animals = {"Tom", "Billy", "Mimi", "Rex", "Bob", "Tom"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        taskString.animalsEquals(animals);
        String result = outContent.toString().trim();
        assertTrue(result.contains("Tom found at index 0"));
        assertTrue(result.contains("Tom found at index 5"));
    }

    @Test
    public void testAnimalsEquals_NoTomFound() {
        TaskString taskString = new TaskString();
        String[] animals = {"Billy", "Mimi", "Rex", "Bob"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        taskString.animalsEquals(animals);
        assertTrue(outContent.toString().trim().equals("No animals with name 'Tom' found"));
    }
}

