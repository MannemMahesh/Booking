package com.htc.booking.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.booking.entity.Booking;
@Repository
public interface BookingInterface extends JpaRepository<Booking, String>{

}

