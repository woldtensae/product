package www.productservices.com.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="category_name")
	private String categoryName;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="category", cascade=CascadeType.ALL)
	private Set<Product> products = new HashSet<Product>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Set<Product> getProducts() {
		return products; 
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
