package com.example.project.service;
import com.example.project.model.Product;
import com.example.project.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
private  final ProductRepository productRepository;

public ProductService(ProductRepository productRepository)
{
    this.productRepository = productRepository;
}

    public Product getProductById(Long id)
    {
    return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProducts()
    {
    return productRepository.findAll();
    }


    public Product addProduct(Product product)
    {
    return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product)
    {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStock(product.getStock());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id)
    {
         productRepository.deleteById(id);
    }
}
