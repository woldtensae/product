package www.productservice.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import www.productservices.com.domain.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, String>{
	Account findByAccountNumber(String accountNumber);
}
