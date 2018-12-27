package com.wipro.topgear.junit.ex1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountTest {
    private WordCount wordCount;

    @Before
    public void setup() {
        wordCount = new WordCount();
    }

    @Test
    public void testCountWithZeroWords() throws Exception {
        int count = wordCount.count("");

        assertEquals("Should contain 0 words", 0, count);
    }

    @Test
    public void testCountWithOneWords() throws Exception {
        int count = wordCount.count("Banana");

        assertEquals("Should contain 1 words", 1, count);
    }

    @Test
    public void testCountWithTwoWords() throws Exception {
        int count = wordCount.count("Banana Apple");

        assertEquals("Should contain 2 words", 2, count);
    }

    @Test
    public void testCountWithThreeWords() throws Exception {
        int count = wordCount.count("Banana Apple  Tomato");

        assertEquals("Should contain 3 words", 3, count);
    }

    @Test
    public void testCountWithOnlyWhiteSpace() throws Exception {
        int count = wordCount.count("   ");

        assertEquals("Should contain 0 words", 0, count);
    }

}