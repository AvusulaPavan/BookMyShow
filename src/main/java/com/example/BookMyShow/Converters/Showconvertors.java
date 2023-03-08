package com.example.BookMyShow.Converters;

import com.example.BookMyShow.Entities.ShowEntity;
import com.example.BookMyShow.EntityDtos.ShowEntryDto;

public class Showconvertors {
    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}
