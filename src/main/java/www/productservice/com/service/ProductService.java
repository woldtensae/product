package www.productservice.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.productservice.com.repository.CategoryRepository;
import www.productservice.com.repository.ProductRepository;
import www.productservices.com.domain.Category;
import www.productservices.com.domain.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	CategoryRepository categoryRepository;
	
	public void saveProduct(Product product, String categoryName) {
		Category category = categoryRepository.findByCategoryName(categoryName);
		product.setCategory(category);
		productRepository.save(product);
	}
	
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}
}
