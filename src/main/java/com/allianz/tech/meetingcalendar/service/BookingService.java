package com.allianz.tech.meetingcalendar.service;

import com.allianz.tech.meetingcalendar.model.Book;

import java.util.Date;
import java.util.List;

public interface BookingService {
    Book book(Book book);

    List<Book> list();

    List<String> avail();

    String who(Date date);
}
