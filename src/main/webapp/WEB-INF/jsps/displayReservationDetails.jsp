<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<pre>
<h2>Flight Details:</h2>
Airlines: ${reservation.flight.operatingAirlines}
Flight No: ${reservation.flight.flightNumber}
Departure City: ${reservation.flight.departureCity}
Arrival City: ${reservation.flight.arrivalCity}
Date Of Departure: ${reservation.flight.dateOfDeparture}
Estimate Departure Time: ${reservation.flight.estimatedDepartureTime}

<h2>Passenger Details:</h2>
First Name: ${reservation.passenger.firstName}
Last Name: ${reservation.passenger.lastName}
Email: ${reservation.passenger.email}
Phone: ${reservation.passenger.phone}
</pre>

<form action="completeCheckIn" method="post">
<pre>
Enter the Number Of Bags You want to check in:<input type="text" name="numberOfBags">
<input type="hidden" value="${reservation.id}" name="reservationId">
<input type="submit" value="Check In">
</pre>
</form>

</body>
</html>