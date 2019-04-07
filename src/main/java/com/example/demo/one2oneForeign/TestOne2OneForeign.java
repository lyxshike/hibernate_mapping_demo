package com.example.demo.one2oneForeign;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/*
 * */
//@Component
public class TestOne2OneForeign implements CommandLineRunner{
	
	@Autowired
	private Person_o2ofRepository person_o2ofRepository;

	@Autowired
	private IdCard_o2ofRepository idCard_o2ofRepository;
	
	public void add(){
		IdCard_o2of idCard_o2of = new IdCard_o2of("6103241995");
		
		Person_o2of person_o2of = new Person_o2of("shike");
		person_o2of.setIdCard_o2of(idCard_o2of);
		idCard_o2ofRepository.save(idCard_o2of);
		person_o2ofRepository.save(person_o2of);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
	}
 }
