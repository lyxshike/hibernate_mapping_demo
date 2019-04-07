package com.example.demo.compositeKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCompositeKey implements CommandLineRunner {

	@Autowired
	private PersonInfoRepository personInfoRepository;
	
	public void add() {
		Address address = new Address();
		address.setName("shike");
		address.setPhoneNum(13468682371L);
		PersonInfo personInfo = new PersonInfo();
		personInfo.setAddress(address);
		personInfo.setLover("dream girl");
		personInfoRepository.save(personInfo);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
       add();
	}

}
