package com.allianz.tech.meetingcalendar.service;

import com.allianz.tech.meetingcalendar.model.Booking;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class DefaultBookingService implements BookingService {

    private static final String UNKNOWN_OWNER = "Not yet implemented.";
    @Override
    public Booking add(Booking booking) {
        return booking;
    }

    @Override
    public List<Booking> getAllBookings() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getAllBookablePeriods() {
        return Collections.emptyList();
    }

    @Override
    public String who(Date date) {
        return UNKNOWN_OWNER;
    }
}
