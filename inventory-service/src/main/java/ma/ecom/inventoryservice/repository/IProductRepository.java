package ma.ecom.inventoryservice.repository;

import ma.ecom.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IProductRepository extends JpaRepository<Product, Long> {
}
