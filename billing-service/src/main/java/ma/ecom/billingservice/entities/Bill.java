package ma.ecom.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.ecom.billingservice.model.Customer;

import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue
    private Long billingId;
    private Date billingDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> products;
    @Transient
    private Customer customer;
}
