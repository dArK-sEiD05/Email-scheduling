package com.example.emailscheduler.Payload;

import java.time.LocalDateTime;
import java.time.ZoneId;


import java.time.LocalDateTime;
import java.time.ZoneId;

public class ScheduleEmailRequest {
    private String email;

    private String subject;

    private String body;

    private LocalDateTime dateTime;

    private ZoneId timeZone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(ZoneId timeZone) {
        this.timeZone = timeZone;
    }
}
