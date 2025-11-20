package ma.ecom.billingservice.repositories;

import ma.ecom.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface IProductRepository extends JpaRepository<ProductItem,Long> {
    List<ProductItem> findByBillId(Long billingId);
}
