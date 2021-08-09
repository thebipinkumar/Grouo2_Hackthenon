package com.hack.portfolio.portfoliomanagement.service;

import com.hack.portfolio.portfoliomanagement.domain.PortfolioSummary;
import com.hack.portfolio.portfoliomanagement.repository.OrderDetail;
import com.hack.portfolio.portfoliomanagement.repository.PortfolioDetail;
import com.hack.portfolio.portfoliomanagement.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service

public class PortfolioService {
 @Autowired
  PortfolioRepository portfolioRepository;
    public Optional<List<PortfolioSummary>> getportfolioSummary(PortfolioSummary summary){
        List<PortfolioSummary> retOutList = new ArrayList<>();
        if(summary.getPortfolioRefNumber() !=null){

            PortfolioDetail portDetail= portfolioRepository.getPortfolioDetailById(summary.getPortfolioRefNumber());

            if(portDetail !=null) {

                for(OrderDetail order : portDetail.getOrderDetailSet()){
                    PortfolioSummary temp = new PortfolioSummary();
                    temp.setPortfolioRefNumber(portDetail.getId());
                    temp.setOrderRefNumner(order.getOrderRefNum());
                    temp.setCredit(portDetail.getAcccountdetails().getCredit());
                    temp.setDebit(portDetail.getAcccountdetails().getDebit());
                    temp.setOrderDate(order.getCreatedOn());
                    temp.setRunningBalance(portDetail.getAcccountdetails().getRunningBalance());
                    temp.setSecurityName(order.getSecurityDetail().getName());
                    temp.setOrderDate(order.getCreatedOn().toString());

                    temp.setTransactionType(order.getTransactionType());

                    retOutList.add(temp);
                }
            }



        }

     return Optional.ofNullable(retOutList);
    }

}
