package com.htc.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.htc.booking.entity.Booking;
import com.htc.booking.service.BookingInterface;

public class BookingServiceController {
	 
	 @Autowired
	 private BookingInterface bookingserviceinterface;
	 
	 @GetMapping("/booking/{restaurantId}")
		Booking getResterantbyRestaurantId(@PathVariable String restaurantId)
		{
		 
		 Booking booking =null;
		 booking=bookingserviceinterface.getById(restaurantId);
		 
			return booking;
			
		}
	 
	
	 @PostMapping("/addbooking")
		Booking BookingRestaurant(@RequestBody Booking booking)
		{
			return booking;
			
		}
		
	 
	
}

