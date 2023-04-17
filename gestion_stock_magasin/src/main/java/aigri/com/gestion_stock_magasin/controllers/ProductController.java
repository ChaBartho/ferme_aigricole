package aigri.com.gestion_stock_magasin.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aigri.com.forms.ProductCreateForm;
import aigri.com.gestion_stock_magasin.models.dto.ProductDTO;
import aigri.com.gestion_stock_magasin.services.ProductService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping("/add")
    public void create(@RequestBody @Valid ProductCreateForm form){
        productService.createProduct(form);
    }
    @GetMapping("/{id:[0-9]+}")
    public ProductDTO getOne(@RequestBody @PathVariable("id") long id) throws Exception{
        try{
            return productService.getProduct(id);
        } catch(Exception e) {
            throw new Exception();
        }
    }
}
