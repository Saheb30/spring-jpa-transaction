package org.saheb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("org.saheb")
@EnableJpaRepositories("org.saheb.repo")
@EntityScan("org.saheb.vo")
@EnableTransactionManagement
public class SpringJpaTransactionApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaTransactionApplication.class, args);

	}
}
