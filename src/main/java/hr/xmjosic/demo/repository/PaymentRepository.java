package hr.xmjosic.demo.repository;

import hr.xmjosic.demo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, String> {
    Payment findByPassengerId(Long passengerId);
}
