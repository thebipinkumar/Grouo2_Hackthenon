package com.hack.portfolio.portfoliomanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class PortfolioManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioManagementApplication.class, args);
    }

}
