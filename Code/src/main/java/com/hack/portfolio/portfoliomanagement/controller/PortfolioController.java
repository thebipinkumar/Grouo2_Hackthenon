package com.hack.portfolio.portfoliomanagement.controller;

import com.hack.portfolio.portfoliomanagement.domain.PortfolioSummary;
import com.hack.portfolio.portfoliomanagement.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PortfolioController {
    @Autowired
    PortfolioService portfolioService;
    @PostMapping("/portfolioSummary")
    public ResponseEntity<List<PortfolioSummary>> portfolioSummary(@RequestBody PortfolioSummary summary) {

        Optional<List<PortfolioSummary>> retSummary = portfolioService.getportfolioSummary(summary);

        if(retSummary.isPresent()){
            if(!retSummary.get().isEmpty()) {
                return ResponseEntity.ok(retSummary.get());
            }else{

                return new ResponseEntity("Invalid PortFolio Ref", HttpStatus.BAD_REQUEST);


            }
        }else{

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
