package com.hack.portfolio.portfoliomanagement.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class PortfolioSummary {

   private  Integer portfolioRefNumber;
    private String securityName;
    private String transactionType;
    private String   fromDate;
    private String toDate;
    private String orderDate;
    private String orderRefNumner;
    private Integer credit;
    private Integer debit;
    private Integer runningBalance ;



}
