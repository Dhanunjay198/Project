package com.flightapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightapp.entity.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Long> {

	List<Reservation> findByEmail(String email);

	Reservation findByPnr(Integer pnr);

}
