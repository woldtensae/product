package www.productservice.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import www.productservices.com.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
}
