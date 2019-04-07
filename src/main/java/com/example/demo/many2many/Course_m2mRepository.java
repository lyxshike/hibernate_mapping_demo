package com.example.demo.many2many;


import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Course_m2mRepository extends JpaRepository<Course_m2m, Integer> {
}
