package www.productservice.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import www.productservice.com.service.ProductService;
import www.productservices.com.domain.Product;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/saveProduct")
		public void saveProduct() {
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){
		return productService.getAllProducts();
	}
}
