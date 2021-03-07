package hr.xmjosic.demo.dto;

import hr.xmjosic.demo.entity.Passenger;
import hr.xmjosic.demo.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class FlightBookingRequest {

    private final Passenger passenger;
    private final Payment payment;


}
