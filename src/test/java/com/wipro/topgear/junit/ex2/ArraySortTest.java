package com.wipro.topgear.junit.ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortTest {

    private ArraySort arraySort;

    @Before
    public void setUp() throws Exception {
        arraySort = new ArraySort();
    }

    @Test
    public void testArraySortWithEmptyArray() {
        int[] sorted = arraySort.sortNumbers(new int[]{});

        assertArrayEquals("Should be an empty array", new int[]{}, sorted);
    }

    @Test
    public void testArraySortWithOneElement() {
        int[] sorted = arraySort.sortNumbers(new int[]{1});

        assertArrayEquals("Should be [1]", new int[]{1}, sorted);
    }

    @Test
    public void testArraySortWithTwoElements() {
        int[] sorted = arraySort.sortNumbers(new int[]{1, 0});

        assertArrayEquals("Should be [0,1]", new int[]{0, 1}, sorted);
    }

    @Test
    public void testArraySortWithThreeElements() {
        int[] sorted = arraySort.sortNumbers(new int[]{1, 0, 3});

        assertArrayEquals("Should be [0,1,3]", new int[]{0, 1, 3}, sorted);
    }

    @Test
    public void testArraySortWithFourElements() {
        int[] sorted = arraySort.sortNumbers(new int[]{1, 0, 3, 2});

        assertArrayEquals("Should be [0,1,2,3]", new int[]{0, 1, 2, 3}, sorted);
    }

}