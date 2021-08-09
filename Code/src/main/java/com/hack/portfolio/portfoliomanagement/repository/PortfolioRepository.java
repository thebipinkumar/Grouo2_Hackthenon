package com.hack.portfolio.portfoliomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends JpaRepository<PortfolioDetail, Integer> {

    PortfolioDetail getPortfolioDetailById(Integer id);

}
