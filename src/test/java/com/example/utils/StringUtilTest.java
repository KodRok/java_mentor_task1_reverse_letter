package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilTest {

    @Test
   void reverse_shouldReturnEmptyString_ifInputStringIsEmpty() {
        String input = "";
        String expected = "";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverse_shouldReturnEmptyString_ifInputStringIsNull() {
        String input = null;
        String expected = "";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverse_shouldReturnReverseString_ifInputContainsOnlyLetters() {
        String input = "asdf";
        String expected = "fdsa";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverse_shouldReverseOnlyLetters_ifInputContainsNotOnlyLetters() {
        String input = "asdf123*//**";
        String expected = "fdsa123*//**";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverse_shouldReturnTheSameString_ifInputContainsOnlyOneLetter() {
        String input = "a";
        String expected = "a";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverse_shouldReturnStringWithTheSameMiddle_ifInputContainsEven() {
        String input = "a23kjl";
        String expected = "l23jka";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    void reverse_shouldReturnReverseString_ifInputContainsOddSymbols() {
        String input = "1234567ad";
        String expected = "1234567da";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }
}