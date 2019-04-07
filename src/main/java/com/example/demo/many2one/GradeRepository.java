package com.example.demo.many2one;


import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends JpaRepository<Grade_m2o, Integer> {
}
