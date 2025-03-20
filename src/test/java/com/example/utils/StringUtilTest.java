package com.example.utils;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void ShouldReverseEmptyString() {
        String input = "";
        String expected = "";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReverseNullString() {
        String input = null;
        String expected = "";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReverseStringLetters() {
        String input = "asdf";
        String expected = "fdsa";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReverseOnlyLetters() {
        String input = "asdf123*//**";
        String expected = "fdsa123*//**";
        String actual = StringUtil.reverse(input);
        assertEquals(expected, actual);
    }

   @Test
    public void ShouldMoveToAnotherCharacterIfNoLettersAtStart() {
        char[] strArray = "6java/ads".toCharArray();
        int start = 0;
        int end = strArray.length - 1;
        while (start < end) {
            if (!Character.isLetter(strArray[start])) {
                start++;
            } else {
                break;
            }
        }
        assertEquals(1, start);
    }

    @Test
    public void ShouldMoveToAnotherCharIfSymbolAtStart() {
        char[] strArray = "*java/ads".toCharArray();
        int start = 0;
        int end = strArray.length - 1;
        while (start < end) {
            if (!Character.isLetter(strArray[start])) {
                start++;
            } else {
                break;
            }
        }
        assertEquals(1, start);
    }

    @Test
    public void ShouldMoveToAnotherCharIfSpaceAtStart() {
        char[] strArray = " java/ads".toCharArray();
        int start = 0;
        int end = strArray.length - 1;
        while (start < end) {
            if (!Character.isLetter(strArray[start])) {
                start++;
            } else {
                break;
            }
        }
        assertEquals(1, start);
    }

    @Test
    public void ShouldMoveToEndIfNoLettersAtAll() {
        char[] strArray = "*-+123".toCharArray();
        int start = 0;
        int end = strArray.length-1;
        while (start <= end) {
            if (!Character.isLetter(strArray[start])) {
                start++;
            } else {
                break;
            }
        }
        assertEquals(strArray.length, start);
    }
}