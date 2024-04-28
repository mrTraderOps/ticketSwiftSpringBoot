package com.ticketReservation.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ticketReservation.models.eventdetailsModel;
import com.ticketReservation.models.priceModel;

@Service
public class priceBusinessService implements priceBusinessServiceInterface {

    @Override
    public void test() {
        System.out.println("priceBusinessService is working");
    }

    @Override
    public List<priceModel> getPrices(String eventID) {
                
        List<priceModel> prices = new ArrayList<priceModel>();

        if ("01".equals(eventID)) {
            prices.add(new priceModel("VIP","April 1", "₱4,410"));
            prices.add(new priceModel("GOLD","April 1", "₱3,500"));
            prices.add(new priceModel("SILVER","April 1", "₱2,000"));
            prices.add(new priceModel("REGULAR","April 1", "₱1,500"));
        }
        else if ("02".equals(eventID)) {
            prices.add(new priceModel("VIP","April 3", "₱10,000"));
            prices.add(new priceModel("GOLD","April 3", "₱8,000"));
            prices.add(new priceModel("SILVER","April 3", "₱5,000"));
            prices.add(new priceModel("REGULAR","April 3", "₱3,000"));
        }
        
        return prices;
    }
    
    public List<eventdetailsModel> createEventDetails(String eventID) {
    	
    	List<eventdetailsModel> details = new ArrayList<eventdetailsModel>();
    	
    	if ("01".equals(eventID)) {
            details.add(new eventdetailsModel("On a crisp evening in the heart of the city, "
            		+ "December Avenue, one of the Philippines' most beloved bands, "
            		+ "is set to take the stage at the Manila Concert Arena on April 15th, 2024. "
            		+ "With their signature blend of heartfelt lyrics and melodic tunes, "
            		+ "December Avenue promises an unforgettable musical experience for fans old and new. "
            		+ "Hailing from Manila, the band has garnered widespread acclaim for their emotionally resonant songs, "
            		+ "capturing the essence of love, loss, and life's poignant moments. This concert is a rare opportunity "
            		+ "for fans to witness their favorite band in person, as they deliver an electrifying performance "
            		+ "that will leave hearts soaring and spirits uplifted.",
            		"For eager concert-goers, tickets for the December Avenue concert are available in various "
            		+ "tiers to suit different preferences and budgets. "
            		+ "VIP tickets offer exclusive access to a prime seating area near the stage, "
            		+ "providing an up-close-and-personal experience with the band for ₱3000. "
            		+ "Gold tickets offer premium seating at ₱2000, while Silver tickets offer comfortable "
            		+ "viewing at ₱1500. For those seeking a more budget-friendly option, Regular "
            		+ "tickets are available for ₱1000. As anticipation builds for the concert, "
            		+ "VIP tickets have already sold out, with only a limited number of Gold, "
            		+ "Silver, and Regular tickets remaining. Fans are encouraged to secure their "
            		+ "tickets soon to ensure they don't miss out on this highly anticipated event."));
        }
        else if ("02".equals(eventID)) {
            details.add(new eventdetailsModel("Prepare for an evening of soulful melodies and infectious beats "
            		+ "as Keshi, the rising star of the indie music scene, takes center stage at the Grand Arena "
            		+ "on May 10th, 2024. With his smooth vocals and captivating stage presence, Keshi promises "
            		+ "to deliver an unforgettable performance for fans gathered in Los Angeles. Originating "
            		+ "from Houston, Texas, Keshi has quickly gained recognition for his genre-blending sound, "
            		+ "drawing inspiration from R&B, pop, and alternative rock. This concert is a rare "
            		+ "opportunity for music enthusiasts to immerse themselves in Keshi's unique musical "
            		+ "universe, as he shares his latest hits and fan favorites in an intimate live setting.",
            		"Tickets for the highly anticipated Keshi concert are now available for purchase, "
            		+ "offering fans a range of options to tailor their concert experience. VIP tickets provide "
            		+ "exclusive access to a premium seating area near the stage, allowing fans to enjoy Keshi's "
            		+ "performance up close for $100. Gold tickets offer prime seating at $75, while Silver "
            		+ "tickets provide comfortable viewing at $50. For those seeking an affordable option, "
            		+ "Regular tickets are available for $30. As excitement builds for the concert, "
            		+ "VIP tickets have quickly sold out, with limited availability remaining for Gold, Silver, "
            		+ "and Regular tickets. Fans are encouraged to secure their tickets promptly to avoid missing "
            		+ "out on this electrifying musical event."));
        }
    	
    	return details;
    }
}
