package ma.ecom.billingservice.repositories;

import ma.ecom.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<ProductItem,Long> {
    List<ProductItem> findByBillId(Long billId);
}
