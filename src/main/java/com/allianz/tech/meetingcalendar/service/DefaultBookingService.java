package com.allianz.tech.meetingcalendar.service;

import com.allianz.tech.meetingcalendar.model.Book;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class DefaultBookingService implements BookingService {

    private static final String UNKNOWN_OWNER = "Not yet implemented.";
    @Override
    public Book book(Book book) {
        return book;
    }

    @Override
    public List<Book> list() {
        return Collections.emptyList();
    }

    @Override
    public List<String> avail() {
        return Collections.emptyList();
    }

    @Override
    public String who(Date date) {
        return UNKNOWN_OWNER;
    }
}
