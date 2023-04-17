package aigri.com.gestion_stock_magasin.utils.mappers;

import org.springframework.stereotype.Service;

import aigri.com.gestion_stock_magasin.models.dto.ProductDTO;
import aigri.com.gestion_stock_magasin.models.entities.Product;

@Service
public class ProductMapper {
    public ProductDTO toDTO(Product product){
        if(product == null){
            return null;
        }
        return ProductDTO.builder()
                         .name(product.getName())
                         .quantity(product.getQuantity())
                         .build();
    }
}
