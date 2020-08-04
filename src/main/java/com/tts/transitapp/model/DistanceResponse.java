package com.tts.transitapp.model;

import java.util.List;

import lombok.Data;

@Data
public class DistanceResponse {
    public List<Row> rows;
}