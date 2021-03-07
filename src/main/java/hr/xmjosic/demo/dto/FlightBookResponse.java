package hr.xmjosic.demo.dto;

import hr.xmjosic.demo.entity.Passenger;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookResponse {
    private String status;
    private Double totalFare;
    private String paymentNo;
    private Passenger passenger;
}
