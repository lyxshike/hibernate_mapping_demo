package com.example.demo.o2m_m2o;


import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Grade_o2m_m2oRepository extends JpaRepository<Grade_o2m_m2o, Integer> {
}
