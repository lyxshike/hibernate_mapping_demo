package com.example.demo.many2one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class TestMany2One implements CommandLineRunner{
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
		get();
		update();
		
	}
	
	
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private GradeRepository gradeRepository;
	   
	public void add() {
		Grade_m2o g = new Grade_m2o("1班","软件开发一班");
		Student_m2o s1 = new Student_m2o("小旺","男",g);
		Student_m2o s2 = new Student_m2o("小红","女",g);
		
		gradeRepository.save(g);
		studentRepository.save(s1);
		studentRepository.save(s2);
	    System.out.println(s1.toString());
		
	}
	
	public void get() {
		Grade_m2o g2 = gradeRepository.getOne(1);
		System.out.println(g2.getGname() +"  "+g2.getGdesc());
		List<Student_m2o> students =studentRepository.findAll();
		for(Student_m2o stu: students){
			System.out.println(stu.getSname()+"  "+stu.getSex()+""+stu.getGrade());
		}
	}
	
	public void update(){
		Grade_m2o grade = new Grade_m2o("2班","软件开发二班");
		Student_m2o stu = studentRepository.getOne(1);
		stu.setGrade(grade);
		gradeRepository.save(grade);
		studentRepository.save(stu);
		
	}
	
	
	
}
