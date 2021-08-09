package com.hack.portfolio.portfoliomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SecurityDetailRepository extends JpaRepository<SecurityDetail,Integer> {

    List<SecurityDetail> findSecurityDetailById(Integer id);
}
