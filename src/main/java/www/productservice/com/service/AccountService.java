package www.productservice.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.productservice.com.repository.AccountRepository;
import www.productservices.com.domain.Account;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;
	
	public void saveAccount(Account account) {
		accountRepository.save(account);
	}
	
}
