package www.productservice.com.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import www.productservices.com.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	Category findByCategoryName(String categoryName);
}
