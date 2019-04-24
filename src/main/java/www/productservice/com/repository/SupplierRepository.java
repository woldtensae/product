package www.productservice.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import www.productservices.com.domain.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long>{
	
}
