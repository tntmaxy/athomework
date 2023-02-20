package com.allianz.tech.meetingcalendar.controller;

import com.allianz.tech.meetingcalendar.model.Booking;
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
    public Booking book(Booking booking) {
        return bookingService.add(booking);
    }

    @GetMapping("/list")
    public List<Booking> list() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/avail")
    public List<String> avail() {
        return bookingService.getAllBookablePeriods();
    }

    @GetMapping("/who")
    public String who(Date date) {
        return bookingService.who(date);
    }
}
