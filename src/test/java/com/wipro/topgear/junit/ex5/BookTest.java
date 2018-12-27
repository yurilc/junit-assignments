package com.wipro.topgear.junit.ex5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BookTest {

    @Parameters
    public static Iterable<Object[]> parameters() {
        return Arrays.asList(new Object[][] {
                {100, 0.1, 90}, {50, 0.2, 40}, {80, 0.05, 76}
        });
    }

    @Parameter
    public int price;
    @Parameter(1)
    public double discount;
    @Parameter(2)
    public double discountedPrice;

    private Book book;

    @Before
    public void setUp() throws Exception {
        book = new Book();
    }

    @Test
    public void testDiscountedPrice() {
        assertEquals(discountedPrice, book.discountedPrice(price, discount), 0);
    }
}