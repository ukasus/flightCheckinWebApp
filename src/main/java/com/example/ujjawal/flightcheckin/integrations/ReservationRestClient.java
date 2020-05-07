package com.example.ujjawal.flightcheckin.integrations;

import com.example.ujjawal.flightcheckin.integrations.dto.ReservationUpdateRequest;
import com.example.ujjawal.flightcheckin.integrations.dto.reservation;

public interface ReservationRestClient {
	
	public reservation findReservation(Long id);
	
	public reservation updateReservation(ReservationUpdateRequest request);

}
