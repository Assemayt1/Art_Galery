package com.example.art_galery.controller;

import com.example.art_galery.model.Artist;
import com.example.art_galery.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired
    private ArtistRepository artistRepository; // Это экземпляр репозитория

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistRepository.findAll(); // Вызов метода через экземпляр
    }

    @PostMapping
    public Artist createArtist(@RequestBody Artist artist) {
        return artistRepository.save(artist); // Вызов метода через экземпляр
    }

    @GetMapping("/{id}")
    public Artist getArtistById(@PathVariable Long id) {
        return artistRepository.findById(id).orElse(null); // Вызов метода через экземпляр
    }
}