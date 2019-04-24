package www.productservices.com.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Column(name="holder_fullname")
	private String accountHolderFullName;
	
	@Id
	private String accountNumber;
	@Column(name="bank_name")
	private String bankName;
	
	@OneToOne(mappedBy = "account", cascade = CascadeType.ALL,
	fetch = FetchType.LAZY, optional = false)
	private Supplier supplier;
	
	public String getAccountHolderFullName() {
		return accountHolderFullName;
	}
	public void setAccountHolderFullName(String accountHolderFullName) {
		this.accountHolderFullName = accountHolderFullName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
}
