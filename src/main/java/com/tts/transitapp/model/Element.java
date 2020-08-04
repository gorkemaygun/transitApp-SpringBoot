package com.tts.transitapp.model;

import lombok.Data;

@Data
public class Element {
    public Distance distance;
    public Duration duration;
    public String status;
}