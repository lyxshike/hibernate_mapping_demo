package com.example.demo.many2one;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student_m2o, Integer> {
}
