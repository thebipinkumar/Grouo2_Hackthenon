package com.hack.portfolio.portfoliomanagement.service;

import com.hack.portfolio.portfoliomanagement.controller.PortfolioController;
import com.hack.portfolio.portfoliomanagement.domain.PortfolioSummary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PortfolioServiceTest {

  PortfolioService portfolioService;


    @BeforeEach
    public void setUp() {
        this.portfolioService = new PortfolioService();


    }

   @Test
    public void testResponseWhenPortfolioRefNumberisProvided(){
       PortfolioSummary summary= new PortfolioSummary();
       Optional<List<PortfolioSummary>> res = portfolioService.getportfolioSummary(summary);


       assertThat(res.isPresent());


    }

}
