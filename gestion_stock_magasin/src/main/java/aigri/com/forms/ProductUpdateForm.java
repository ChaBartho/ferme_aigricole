package aigri.com.forms;

import aigri.com.gestion_stock_magasin.models.entities.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class ProductUpdateForm {
    
    @NotNull
    private String name;
    @NotNull
    private int quantity;
    
    public Product toEntity(){
        Product entity = new Product();
        entity.setName(name);
        entity.setQuantity(quantity);
        return entity;
    }
}
