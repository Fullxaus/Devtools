package ru.mentee.power.devtools;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class LiveCodingDemoTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSumEven() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int expected = 2 + 4 + 6;
        int actual = liveCodingDemo.sumEven(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumEven_EmptyArray() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {};
        int expected = 0;
        int actual = liveCodingDemo.sumEven(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumODD() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int expected = 1 + 3 + 5;
        int actual = liveCodingDemo.sumODD(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumODD_EmptyArray() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {};
        int expected = 0;
        int actual = liveCodingDemo.sumODD(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMax() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int expected = 6;
        int actual = liveCodingDemo.findMax(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMax_EmptyArray() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> liveCodingDemo.findMax(numbers));
    }

    @Test
    public void testFindMin() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int expected = 1;
        int actual = liveCodingDemo.findMin(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMin_EmptyArray() {
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> liveCodingDemo.findMin(numbers));
    }

    @Test
    public void testPrintFizzBuzz_zeroDoesNothing() {
        LiveCodingDemo.printFizzBuzz(0);
        assertEquals("", outContent.toString());
    }
}
