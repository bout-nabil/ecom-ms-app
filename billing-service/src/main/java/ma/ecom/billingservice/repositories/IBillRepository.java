package ma.ecom.billingservice.repositories;

import ma.ecom.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBillRepository extends JpaRepository<Bill, Long> {
}
