package com.hack.portfolio.portfoliomanagement.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="SECURITY_DETAIL")
@Getter @Setter @NoArgsConstructor
public class SecurityDetail implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Integer value;
}
