package com.example.demo.oneAoneForeign;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/*
 * */
@Component
public class TestOneAOneForeign implements CommandLineRunner{
	
	@Autowired
	private Person_oAofRepository person_oAofRepository;

	@Autowired
	private IdCard_oAofRepository idCard_oAofRepository;
	
	public void add(){
		IdCard_oAof idCard_oAof = new IdCard_oAof("6103241997");
		Person_oAof person_oAof = new Person_oAof("shike");
		person_oAof.setIdCard_oAof(idCard_oAof);
		
		person_oAofRepository.save(person_oAof);
		idCard_oAofRepository.save(idCard_oAof);
		
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
	}
 }
