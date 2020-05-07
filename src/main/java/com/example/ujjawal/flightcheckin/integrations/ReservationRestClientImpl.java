package com.example.ujjawal.flightcheckin.integrations;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.ujjawal.flightcheckin.integrations.dto.ReservationUpdateRequest;
import com.example.ujjawal.flightcheckin.integrations.dto.reservation;
@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String RESERVATION_URL_CLIENT = "http://localhost:8080/flightreservation/reservations/";

	@Override
	public reservation findReservation(Long id) {
		RestTemplate restTemplate=new RestTemplate();
		reservation reservation = restTemplate.getForObject(RESERVATION_URL_CLIENT+id, reservation.class);
		
		return reservation;
	}

	@Override
	public reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		reservation reservation = restTemplate.postForObject(RESERVATION_URL_CLIENT, request, reservation.class);
		return reservation;
	}

}
