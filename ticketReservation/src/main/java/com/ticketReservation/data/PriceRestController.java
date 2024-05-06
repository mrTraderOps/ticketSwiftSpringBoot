//package com.ticketReservation.data;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.ticketReservation.models.priceModel;
//import com.ticketReservation.models.pricesModel;
//import com.ticketReservation.services.priceBusinessServiceInterface;
//
//@RestController
//@RequestMapping("/api/v1/prices")
//public class PriceRestController {
//    
//    @Autowired
//    private priceBusinessServiceInterface service;
//    
//    public PriceRestController(priceBusinessServiceInterface service) {
//        this.service = service;
//    }
//    
//    @GetMapping("/")
//    public List<pricesModel> showAllPrices() {
//
//        // Retrieve prices using the service
//        List<pricesModel> prices = service.getPrices();
//        
//        return prices;
//    }
//    @GetMapping("/search/{searchTerm}")
//    public List<pricesModel> searchPrices(@PathVariable(name="searchTerm") String searchTerm ) {
//
//        // Retrieve prices using the service
//        List<pricesModel> prices = service.searchPrices(searchTerm);
//        
//        return prices;
//    }
//    @PostMapping("/")
//    public long addPrice(@RequestBody pricesModel model) {
//		return service.addOne(model);
//    }
//    @GetMapping("/{price}")
//    public pricesModel getByLocation(@PathVariable(name="price") long id) {
//    	
//    	return service.getById(id);
//    }
//    @GetMapping("/delete/{price}")
//    public boolean deleteOne(@PathVariable(name="price") long id) {
//    	
//    	return service.deleteOne(id);
//    }
//    @PutMapping("/update/{price}")
//    public pricesModel updateOne(@RequestBody pricesModel model, @PathVariable(name="price") long id) {
//		return service.updateOne(id, model);
//    }
//}
//
//
//	
//
