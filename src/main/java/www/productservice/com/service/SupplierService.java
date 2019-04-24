package www.productservice.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.productservice.com.repository.SupplierRepository;
import www.productservices.com.domain.Supplier;

@Service
public class SupplierService {
  @Autowired
  private SupplierRepository supplierRepository;
  
  public void saveSupplier(Supplier supplier) {
	  supplierRepository.save(supplier);
  }
}
