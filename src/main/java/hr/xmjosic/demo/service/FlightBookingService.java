package hr.xmjosic.demo.service;

import hr.xmjosic.demo.dto.FlightBookResponse;
import hr.xmjosic.demo.dto.FlightBookingRequest;
import hr.xmjosic.demo.entity.Passenger;
import hr.xmjosic.demo.entity.Payment;
import hr.xmjosic.demo.repository.PassengerRepository;
import hr.xmjosic.demo.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static hr.xmjosic.demo.utils.PaymentUtils.validateCreditLimit;

@Service
@Data
@AllArgsConstructor
public class FlightBookingService {

    private final PassengerRepository passengerRepository;
    private final PaymentRepository paymentRepository;

    @Transactional
    public FlightBookResponse bookFlightTicket(FlightBookingRequest flightBookingRequest) {
        Passenger passenger = flightBookingRequest.getPassenger();
        passengerRepository.save(passenger);

        Payment payment = flightBookingRequest.getPayment();

        validateCreditLimit(payment.getAccountNo(), passenger.getFare());

        payment.setPassengerId(passenger.getPassengerID());
        payment.setAmount(passenger.getFare());

        paymentRepository.save(payment);

        return new FlightBookResponse("SUCCESS",
                passenger.getFare(),
                paymentRepository.findByPassengerId(passenger.getPassengerID()).getPaymentId(),
                passenger);
    }
}
