package com.hack.portfolio.portfoliomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailRepository extends JpaRepository<AccountDetail,Integer> {
}
