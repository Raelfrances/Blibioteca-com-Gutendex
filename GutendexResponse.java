package com.example.gutendex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GutendexResponse {
    public int count;
    public String next;
    public String previous;
    public List<Book> results;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Book {
        public int id;
        public String title;
        public List<Author> authors;
        public List<String> languages;
        public int download_count;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Author {
            public String name;
            public String birth_year;
            public String death_year;
        }
    }
}
