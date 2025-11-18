package ma.ecom.inventoryservice;

import ma.ecom.inventoryservice.entities.Product;
import ma.ecom.inventoryservice.repository.IProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(IProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .productName("Computer")
                    .productPrice(7000)
                    .productQuantity(20)
                    .build());
            productRepository.save(Product.builder().
                    productName("Phone")
                    .productPrice(8000)
                    .productQuantity(10)
                    .build());
        };
    }
}
