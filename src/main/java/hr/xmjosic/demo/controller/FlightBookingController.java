package hr.xmjosic.demo.controller;

import hr.xmjosic.demo.dto.FlightBookResponse;
import hr.xmjosic.demo.dto.FlightBookingRequest;
import hr.xmjosic.demo.service.FlightBookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class FlightBookingController {

    private final FlightBookingService flightBookingService;

    @PostMapping("/book-flight")
    public FlightBookResponse bookFlightTicket(@RequestBody FlightBookingRequest flightBookingRequest) {
        return flightBookingService.bookFlightTicket(flightBookingRequest);
    }
}
