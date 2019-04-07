package com.example.demo.o2m_m2o;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Student_o2m_m2oRepository extends JpaRepository<Student_o2m_m2o, Integer> {
}
