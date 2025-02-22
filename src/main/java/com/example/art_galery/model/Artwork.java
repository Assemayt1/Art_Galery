package com.example.art_galery.model;

import jakarta.persistence.*;

@Entity
public class Artwork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Column(name = "\"year\"") // Указываем имя колонки в кавычках
    private int year;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    // Конструкторы, геттеры и сеттеры
    public Artwork() {}

    public Artwork(String title, String description, int year, Artist artist) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.artist = artist;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }
}