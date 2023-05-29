package restTemplates2.restTemplates2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import restTemplates2.restTemplates2.ProductDto;
import restTemplates2.restTemplates2.ProductRepository;
import restTemplates2.restTemplates2.entities.Product;

import java.util.Arrays;
@RestController
public class ServiceController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/products")
    public Product getProductList() {
        Product product=new Product();
        product.setId(1);
        product.setName("tarun");
        return product;

    }
    @PostMapping("/addproducts")
    public ResponseEntity<?> addProductList(@RequestBody Product product) {
//        Product product=new Product();
//        product.setName(productDto.getName());
        productRepository.save(product);
        return new ResponseEntity<>("product is been added",HttpStatus.OK);

    }
}
