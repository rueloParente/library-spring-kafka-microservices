package com.rueloparente.library_service.domain.value_object;

import java.util.Objects;

public class ISBN {
    private String isbn;

    private ISBN(String isbn) {
        if(isbn != null && isValid(isbn)) {
            this.isbn = isbn;
        } else {
            throw new IllegalArgumentException("Invalid ISBN");
        }
    }

    // Factory method to create ISBN from string
    // Could have used a specific factory class but this seems adequate for this case
    public static ISBN fromString(String isbn) {
        return new ISBN(isbn);
    }



    // Business rule: ISBN must be 10 or 13 digits
    // (didn't include the hyphens and the validation of the checksum for simplicity)
    private boolean isValid(String isbn) {
        if(!isbn.matches("[0-9]+")) {
            return false;
        }
        return isbn.length() == 10 || isbn.length() == 13;
    }


    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "ISBN{" +
                "isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ISBN isbn1)) return false;
        return Objects.equals(isbn, isbn1.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
