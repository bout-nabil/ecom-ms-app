package ma.ecom.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {
    @Id @GeneratedValue
    private Long idCustomer;
    private String nameCustomer;
    private String emailCustomer;
}
