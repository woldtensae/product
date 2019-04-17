package www.productservice.com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value= {"www.productservice.com.controller", 
		"www.productservice.com.service", "www.productservices.com.domain", 
		"www.productservice.com.repository"})
@EntityScan("www.productservices.com.domain")
@EnableJpaRepositories("www.productservice.com.repository")
public class ProductApp {
	public static void main(String[] args) {
		SpringApplication.run(ProductApp.class, args);
	}
}
