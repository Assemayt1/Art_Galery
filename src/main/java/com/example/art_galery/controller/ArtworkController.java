package com.example.art_galery.controller;

import com.example.art_galery.model.Artwork;
import com.example.art_galery.repository.ArtworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {

    @Autowired
    private ArtworkRepository artworkRepository; // Это экземпляр репозитория

    @GetMapping
    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll(); // Вызов метода через экземпляр
    }

    @PostMapping
    public Artwork createArtwork(@RequestBody Artwork artwork) {
        return artworkRepository.save(artwork); // Вызов метода через экземпляр
    }

    @GetMapping("/{id}")
    public Artwork getArtworkById(@PathVariable Long id) {
        return artworkRepository.findById(id).orElse(null); // Вызов метода через экземпляр
    }
}