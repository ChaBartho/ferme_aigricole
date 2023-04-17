package aigri.com.gestion_stock_magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aigri.com.gestion_stock_magasin.models.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
    
}
