package com.example.gutendex.service;

import com.example.gutendex.model.GutendexResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookService {

    private final RestTemplate restTemplate = new RestTemplate();

    public GutendexResponse fetchBooks(String search) {
        String url = "https://gutendex.com/books?search=" + search;
        return restTemplate.getForObject(url, GutendexResponse.class);
    }
}
