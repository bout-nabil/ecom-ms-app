package ma.ecom.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.ecom.billingservice.model.Product;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ProductItem {
    @Id @GeneratedValue
    private Long itemId;
    private Long productId;
    private int quantity;
    private double price;
    @ManyToOne
    private Bill bill;
    @Transient
    private Product product;
}
