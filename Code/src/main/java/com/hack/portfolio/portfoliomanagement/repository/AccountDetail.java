package com.hack.portfolio.portfoliomanagement.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="ACCOUNT_DETAIL")
@Getter
@Setter
@NoArgsConstructor
public class AccountDetail implements Serializable {
    @Id
    private Integer id;

    private Integer credit;
    private Integer debit;
    private Integer runningBalance;
    private String createdOn;
    private Integer createdBy;





}
