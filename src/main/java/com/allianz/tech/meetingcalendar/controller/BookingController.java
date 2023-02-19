package com.allianz.tech.meetingcalendar.controller;

import com.allianz.tech.meetingcalendar.model.Book;
import com.allianz.tech.meetingcalendar.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/book")
    public Book book(Book book) {
        return bookingService.book(book);
    }

    @GetMapping("/list")
    public List<Book> list() {
        return bookingService.list();
    }

    @GetMapping("/avail")
    public List<String> avail() {
        return bookingService.avail();
    }

    @GetMapping("/who")
    public String who(Date date) {
        return bookingService.who(date);
    }
}
