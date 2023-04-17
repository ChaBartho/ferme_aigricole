package aigri.com.gestion_stock_magasin.services;

import java.util.List;

import aigri.com.forms.ProductCreateForm;
import aigri.com.forms.ProductUpdateForm;
import aigri.com.gestion_stock_magasin.models.dto.ProductDTO;
import aigri.com.gestion_stock_magasin.models.entities.Product;

public interface ProductService {
    long createProduct(ProductCreateForm form);
    ProductDTO getProduct(long id);
    List<ProductDTO> getAllProducts();
    void updateProduct(long id, ProductUpdateForm form);
    void deleteProduct(long id);

}
