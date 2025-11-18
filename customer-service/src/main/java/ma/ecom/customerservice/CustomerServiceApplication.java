package ma.ecom.customerservice;

import ma.ecom.customerservice.entities.Customer;
import ma.ecom.customerservice.repository.ICustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ICustomerRepository icustomerRepository) {
     return args -> {
         icustomerRepository.save(Customer.builder().nameCustomer("nabil").emailCustomer("nabil@gmail.com").build());
         icustomerRepository.save(Customer.builder().nameCustomer("tawfiq").emailCustomer("tawfiq@gmail.com").build());
         icustomerRepository.save(Customer.builder().nameCustomer("ayoub").emailCustomer("ayoub@gmail.com").build());
     };
    }
}
