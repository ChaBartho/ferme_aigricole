package aigri.com.gestion_stock_magasin.models.dto;

import aigri.com.gestion_stock_magasin.models.entities.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
    private long id;
    private String name;
    private int quantity;

}
