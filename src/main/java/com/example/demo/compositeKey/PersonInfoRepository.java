package com.example.demo.compositeKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInfoRepository extends JpaRepository<PersonInfo, Address> {

}
