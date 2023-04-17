package aigri.com.gestion_stock_magasin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import aigri.com.forms.ProductCreateForm;
import aigri.com.forms.ProductUpdateForm;
import aigri.com.gestion_stock_magasin.models.dto.ProductDTO;
import aigri.com.gestion_stock_magasin.models.entities.Product;
import aigri.com.gestion_stock_magasin.repositories.ProductRepository;
import aigri.com.gestion_stock_magasin.utils.mappers.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {
private ProductRepository productRepository;
private ProductMapper productMapper;
public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper){
    this.productRepository = productRepository;
    this.productMapper = productMapper;
}
    @Override
    public long createProduct(ProductCreateForm form) {
        Product entity = form.toEntity();
        productRepository.save(entity);
        return entity.getId();

    }

    @Override
    public ProductDTO getProduct(long id) {
        
       return productRepository.findById(id)
       .map(productMapper::toDTO)
       .orElseThrow();
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(productMapper::toDTO).toList();
    }

    @Override
    public void updateProduct(long id, ProductUpdateForm form) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(form.getName());
        product.setQuantity(form.getQuantity());
        productRepository.save(product);

    }

    @Override
    public void deleteProduct(long id) {
        productRepository.delete(productRepository.findById(id).orElseThrow());
    }
    
}
