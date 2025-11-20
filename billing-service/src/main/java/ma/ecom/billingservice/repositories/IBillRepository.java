package ma.ecom.billingservice.repositories;

import ma.ecom.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IBillRepository extends JpaRepository<Bill, Long> {
}
