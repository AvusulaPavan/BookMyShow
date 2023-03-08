package com.example.BookMyShow.Converters;

import com.example.BookMyShow.Entities.TicketEntity;
import com.example.BookMyShow.EntityDtos.TicketEntryDto;

public class TicketConvertors {

    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}
