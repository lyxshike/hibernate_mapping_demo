package com.example.demo.one2many;


import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Grade_o2mRepository extends JpaRepository<Grade_o2m, Integer> {
}
