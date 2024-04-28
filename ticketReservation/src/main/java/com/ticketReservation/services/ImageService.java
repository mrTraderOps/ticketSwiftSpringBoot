package com.ticketReservation.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ImageService {
	private Map<String, String> eventImageURLs = new HashMap<>();

    public ImageService() {
        // Populate the map with event IDs and their corresponding image URLs
        eventImageURLs.put("01", "/images/decAveBackG.png");
        eventImageURLs.put("02", "/images/keshiBackG.png");
        // Add more entries as needed
    }

    public String getImageURLForEvent(String eventID) {
        return eventImageURLs.getOrDefault(eventID, "/images/default.jpg");
    }
}
