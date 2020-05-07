package com.example.ujjawal.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ujjawal.flightcheckin.integrations.ReservationRestClient;
import com.example.ujjawal.flightcheckin.integrations.dto.ReservationUpdateRequest;
import com.example.ujjawal.flightcheckin.integrations.dto.reservation;

@Controller
public class ChecInContrller {
	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckin()
	{
		return "startCheckIn";
	}
	
	@RequestMapping("/startCheckIn")
	public String showStartCheckin(@RequestParam("reservationId")Long reservationId,ModelMap modelMap)
	{
		reservation reservation=restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation",reservation);
		return "displayReservationDetails";
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId")Long reservationId,@RequestParam("numberOfBags")int numberOfBags)
	{
		ReservationUpdateRequest reservationUpdateRequest=new ReservationUpdateRequest();
		reservationUpdateRequest.setId(reservationId);
		reservationUpdateRequest.setCheckedIn(true);
		reservationUpdateRequest.setNumberOfBags(numberOfBags);
		restClient.updateReservation(reservationUpdateRequest);
		
		return "checkInConfirmation";
	}

}
