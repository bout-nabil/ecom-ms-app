package ma.ecom.billingservice.web;

import ma.ecom.billingservice.entities.Bill;
import ma.ecom.billingservice.feign.CustomerRestClient;
import ma.ecom.billingservice.feign.ProductRestClient;
import ma.ecom.billingservice.model.Customer;
import ma.ecom.billingservice.repositories.IBillRepository;
import ma.ecom.billingservice.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BillRestController {
    @Autowired
    private IBillRepository  iBillRepository;
    @Autowired
    private IProductRepository iProductRepository;
    @Autowired
    private CustomerRestClient customerRestClient;
    @Autowired
    private ProductRestClient productRestClient;

    @GetMapping("bills/{id}")
    public Bill getBillbyId(@PathVariable Long id){
        Bill bill = iBillRepository.findById(id).get();
        Customer customer = customerRestClient.findByCustomerId(bill.getCustomerId());
        bill.setCustomer(customer);
        bill.getProductItems().forEach(productItem -> {
            productItem.setProduct(productRestClient.getProduct(productItem.getProductId()));
        });
        return bill;
    }

}
