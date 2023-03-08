package com.example.BookMyShow.EntityDtos;

import lombok.Data;

@Data
public class TheaterEntryDto {

    //Attributes that we require
    private String name;
    private String location;

    private int classicSeatsCount;

    private int premiumSeatsCount;
}

