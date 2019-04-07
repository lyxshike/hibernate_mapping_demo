package com.example.demo.one2onePrimary;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/*
 * */
//@Component
public class TestOne2OneForeign implements CommandLineRunner{
	
	@Autowired
	private Person_o2opRepository person_o2opRepository;

	@Autowired
	private IdCard_o2opRepository idCard_o2opRepository;
	
	public void add(){
		IdCard_o2op idCard_o2op = new IdCard_o2op("6103241995");
		
		Person_o2op person_o2op = new Person_o2op("shike");
		person_o2op.setIdCard_o2op(idCard_o2op);
		idCard_o2opRepository.save(idCard_o2op);
		person_o2opRepository.save(person_o2op);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
	}
 }
