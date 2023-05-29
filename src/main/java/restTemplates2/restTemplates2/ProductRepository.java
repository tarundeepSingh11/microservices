package restTemplates2.restTemplates2;

import org.springframework.data.jpa.repository.JpaRepository;
import restTemplates2.restTemplates2.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
