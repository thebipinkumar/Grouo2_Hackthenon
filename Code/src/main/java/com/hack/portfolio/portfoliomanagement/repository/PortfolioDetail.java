package com.hack.portfolio.portfoliomanagement.repository;

import com.hack.portfolio.portfoliomanagement.repository.OrderDetail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name= "PORTFOLIO_DETAILS")
@Getter
@Setter
@NoArgsConstructor
public class PortfolioDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String portfolioName;
    @OneToMany
    @JoinColumn(name= "ID_PORTFOLIO_DETAIL")
    private Set<OrderDetail> orderDetailSet;
    @OneToOne
    @JoinColumn(name= "ID_ACCOUNT_ID")
    private AccountDetail acccountdetails;


}
