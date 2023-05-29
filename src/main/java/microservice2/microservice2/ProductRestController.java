package microservice2.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "/product",method = RequestMethod.POST)
    public Product creatCoupon(@RequestBody Product product){
        Coupon coupon=restTemplate.getForObject("http://localhost:8080/coupanapi/coupons/"+product.getCouponCode(),Coupon.class);
        product.setPrice(product.getPrice()-coupon.getDiscount());

        return productRepo.save(product);
    }
}
