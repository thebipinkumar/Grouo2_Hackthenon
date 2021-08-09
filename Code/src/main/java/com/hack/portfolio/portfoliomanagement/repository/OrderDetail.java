package com.hack.portfolio.portfoliomanagement.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="ORDER_DETAIL")
@Getter
@Setter
@NoArgsConstructor
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String orderRefNum;
    private String orderStatus;
    private String transactionType;
    private String orderValue;
    private String createdOn;
    private Integer createdBy;
    @OneToOne
    @JoinColumn(name = "ID_SECURITY_DETAIL")
    private SecurityDetail securityDetail;




}
