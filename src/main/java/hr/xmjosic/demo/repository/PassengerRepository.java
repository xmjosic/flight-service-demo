package hr.xmjosic.demo.repository;

import hr.xmjosic.demo.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
