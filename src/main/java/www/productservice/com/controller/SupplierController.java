package www.productservice.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import www.productservice.com.service.AccountService;
import www.productservice.com.service.SupplierService;
import www.productservices.com.domain.Account;
import www.productservices.com.domain.Supplier;

@Controller
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/saveSupplier")
	public void saveSupplier() {
		Supplier supplier = new Supplier();
		supplier.setCompanyName("Neway Atalay");
		supplier.setEmail("newayAtalay@gmail.com");
		supplier.setTelephone("251911213170");
		Account account = new Account();
		account.setAccountHolderFullName("Neway Atalay Import");
		account.setAccountNumber("23455647777855");
		supplier.setAccount(account);
		accountService.saveAccount(account);
		supplierService.saveSupplier(supplier);
	}
}











