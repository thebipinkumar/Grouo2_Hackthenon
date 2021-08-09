package com.hack.portfolio.portfoliomanagement.controller;

import com.hack.portfolio.portfoliomanagement.controller.PortfolioController;
import com.hack.portfolio.portfoliomanagement.domain.PortfolioSummary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import java.util.HashMap;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PortfolioControllerTest {


    private PortfolioController portfolioController;
    @BeforeEach
    public void setUp() {
        this.portfolioController = new PortfolioController();


    }


    @Test
    public void givenPortfolioRefNoWhenAvailableShouldReturnResponse(){

        //Given

        PortfolioSummary summary= new PortfolioSummary();



        //When

        final Integer PORTFOLIO_REF_NO=1;
        summary.setPortfolioRefNumber(PORTFOLIO_REF_NO);

        assertThat(portfolioController.portfolioSummary(summary).getStatusCode()).isEqualTo(HttpStatus.OK);
        }


    @Test
    public void givenPortfolioRefNoWhenNotAvailableShouldReturnResponse(){

        //Given

        PortfolioSummary summary= new PortfolioSummary();
        summary.setPortfolioRefNumber(1);


        //When

        final Integer PORTFOLIO_REF_NO=2;

        assertThat(portfolioController.portfolioSummary(summary).getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
    }

}
