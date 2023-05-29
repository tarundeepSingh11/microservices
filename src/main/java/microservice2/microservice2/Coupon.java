package microservice2.microservice2;

import lombok.Data;

@Data
public class Coupon {
    private int id;
    private int discount;
    private String code;
    private String expireDte;

}
