package restTemplates2.restTemplates2.entities;
;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "address_generator")
   @SequenceGenerator(name = "address_generator",sequenceName = "user_generator_seq", initialValue =1 ,allocationSize = 1)
   private int id;
   private String name;
}
