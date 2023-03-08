package com.example.BookMyShow.Converters;

import com.example.BookMyShow.Entities.TheaterEntity;
import com.example.BookMyShow.EntityDtos.TheaterEntryDto;

public class TheaterConvertors {
    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }
}
