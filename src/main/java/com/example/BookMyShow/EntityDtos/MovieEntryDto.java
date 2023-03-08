package com.example.BookMyShow.EntityDtos;

import com.example.BookMyShow.Genres.Genre;
import com.example.BookMyShow.Genres.Language;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
