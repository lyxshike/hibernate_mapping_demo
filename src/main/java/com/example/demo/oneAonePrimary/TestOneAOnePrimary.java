package com.example.demo.oneAonePrimary;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/*
 * */
//@Component
public class TestOneAOnePrimary implements CommandLineRunner{
	
	@Autowired
	private Person_oAopRepository person_oAopRepository;

	@Autowired
	private IdCard_oAopRepository idCard_oAopRepository;
	
	public void add(){
		IdCard_oAop idCard_oAop = new IdCard_oAop("6103241995");
		
		Person_oAop person_oAop = new Person_oAop("shike");
		person_oAop.setIdCard_o2op(idCard_oAop);
		idCard_oAopRepository.save(idCard_oAop);
		person_oAopRepository.save(person_oAop);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
	}
 }
