package com.allianz.tech.meetingcalendar.service;

import com.allianz.tech.meetingcalendar.model.Booking;

import java.util.Date;
import java.util.List;

public interface BookingService {
    Booking add(Booking booking);

    List<Booking> getAllBookings();

    List<String> getAllBookablePeriods();

    String who(Date date);
}
