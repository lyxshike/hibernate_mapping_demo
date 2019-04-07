package com.example.demo.many2many;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Student_m2mRepository extends JpaRepository<Student_m2m, Integer> {
}
