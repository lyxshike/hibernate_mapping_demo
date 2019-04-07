package com.example.demo.one2many;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Student_o2mRepository extends JpaRepository<Student_o2m, Integer> {
}
