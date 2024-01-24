package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Write a test for a method that calculates the sum of two integers.
    @Test
    void sum_when5plus7_thenReturn12(){
        //GIVEN
        int a = 8;
        int b = 7;
        int expected = a + b;

        //WHEN
        int actual = Main.sum(a, b);

        //THEN
        assertEquals(expected,actual);
    }

    //Write a test for a method that checks if a given number is even.
    @Test
    void isEven_whenNumberIsEven_thenReturnTrue(){
        //GIVEN
        int number = 4;

        //WHEN
        boolean actual = Main.isEven(number);

        //THEN
        assertTrue(actual);
    }

    //Write a test for a method that calculates the product of two integers.
    @Test
    void multi_when2times2_thenReturn4(){
        //GIVEN
        int a = 2;
        int b = 2;
        int expected = a * b;

        //WHEN
        int actual = Main.multi(a, b);

        //THEN
        assertEquals(expected,actual);
    }

    //Write a test for a method that converts a given string to uppercase.
    @Test
    void toUppercase_whenStrIsHellojava_thenReturnHELLOJAVA(){
        //GIVEN
        String str = "Hellojava";
        String excepted = str.toUpperCase();

        //WHEN
        String actual = Main.toUppercase(str);

        //THEN
        assertEquals(excepted, actual);
    }

    //Write a test for a method that checks if a given number is positive.
    @Test
    void isPositive_whenNumberIs5_thenReturnTrue(){
        //GIVEN
        int number = 5;

        //WHEN
        boolean actual = Main.isPositive(number);

        //THEN
        assertTrue(actual);
    }



}