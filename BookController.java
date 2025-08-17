package com.example.gutendex.controller;

import com.example.gutendex.model.GutendexResponse;
import com.example.gutendex.service.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public GutendexResponse getBooks(@RequestParam(defaultValue = "") String search) {
        return service.fetchBooks(search);
    }
}
