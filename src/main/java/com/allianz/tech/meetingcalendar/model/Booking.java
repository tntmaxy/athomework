package com.allianz.tech.meetingcalendar.model;

import java.util.Date;

public record Booking(String owner, Date from, Date until) {
}
