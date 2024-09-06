package com.rueloparente.library_service.domain.value_object;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ISBNTest {

    @Test
    void shouldReturnISBNWhenGivenValidValueWithTenDigits() {
        // Given
        String expectedISBN = "1234567890";
        ISBN isbn = ISBN.fromString(expectedISBN);

        // When
        String result = isbn.getIsbn();

        // Then
        assertEquals(expectedISBN, result);
    }

    @Test
    void shouldReturnISBNWhenGivenValidValueWithThirteenDigits() {
        // Given
        String expectedISBN = "1234567890123";
        ISBN isbn = ISBN.fromString(expectedISBN);

        // When
        String result = isbn.getIsbn();

        // Then
        assertEquals(expectedISBN, result);
    }

    @ParameterizedTest()
    @ValueSource(strings = {"123456789", "12345678901", "123456789012", "12345678901234"})
    void shouldThrowExceptionWhenGivenValueWithIncorrectDigitNumber(String isbn) {
        // Given
        String invalidISBN = isbn;
        String expectedMessage = "Invalid ISBN";
        // When
        String expected = assertThrows(IllegalArgumentException.class, () -> ISBN.fromString(invalidISBN)).getMessage();
        // Then
        assertEquals(expectedMessage, expected);
    }

    @ParameterizedTest()
    @ValueSource(strings = {"", " ", "          "})
    @NullSource
    void shouldThrowExceptionWhenGivenEmptyValueOrNull(String isbn) {
        // Given
        String invalidISBN = isbn;
        String expectedMessage = "Invalid ISBN";
        // When
        String expected = assertThrows(IllegalArgumentException.class, () -> ISBN.fromString(invalidISBN)).getMessage();
        // Then
        assertEquals(expectedMessage, expected);
    }

    @Test
    void shouldThrowExceptionWhenGivenValueWithNonNumericCharacter() {
        // Given
        String invalidISBN = "123456789a";
        String expectedMessage = "Invalid ISBN";
        // When
        String expected = assertThrows(IllegalArgumentException.class, () -> ISBN.fromString(invalidISBN)).getMessage();
        // Then
        assertEquals(expectedMessage, expected);
    }

    @Test
    void shouldReturnTrueWhenComparingTwoISBNsWithSameValue() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");
        ISBN isbn2 = ISBN.fromString("1234567890");

        // When
        boolean result = isbn1.equals(isbn2);

        // Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingTwoISBNsWithDifferentValue() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");
        ISBN isbn2 = ISBN.fromString("1234567891");

        // When
        boolean result = isbn1.equals(isbn2);

        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenComparingTwoISBNsWithSameObject() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");

        // When
        boolean result = isbn1.equals(isbn1);

        // Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenComparingISBNWithNull() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");

        // When
        boolean result = isbn1.equals(null);

        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseWhenComparingISBNWithDifferentObject() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");

        // When
        boolean result = isbn1.equals("1234567890");

        // Then
        assertFalse(result);
    }

    @Test
    void shouldReturnSameHashCodeWhenComparingTwoISBNsWithSameValue() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");
        ISBN isbn2 = ISBN.fromString("1234567890");

        // When
        int result1 = isbn1.hashCode();
        int result2 = isbn2.hashCode();

        // Then
        assertEquals(result1, result2);
    }

    @Test
    void shouldReturnDifferentHashCodeWhenComparingTwoISBNsWithDifferentValue() {
        // Given
        ISBN isbn1 = ISBN.fromString("1234567890");
        ISBN isbn2 = ISBN.fromString("1234567891");

        // When
        int result1 = isbn1.hashCode();
        int result2 = isbn2.hashCode();

        // Then
        assertNotEquals(result1, result2);
    }

    @Test
    void shouldReturnStringRepresentationOfISBN() {
        // Given
        ISBN isbn = ISBN.fromString("1234567890");
        String expected = "ISBN{isbn=1234567890}";

        // When
        String result = isbn.toString();

        // Then
        assertEquals(expected, result);
    }

}