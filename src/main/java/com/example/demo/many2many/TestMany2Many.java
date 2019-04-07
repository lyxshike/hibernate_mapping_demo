package com.example.demo.many2many;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/*
 * 
 *  add()中注释的段落为什么没有生效吗？？？？  主控方，和被空方没有搞清楚的
 * */
//@Component
public class TestMany2Many implements CommandLineRunner{
	
	@Autowired
	private Student_m2mRepository student_m2mRepository;

	@Autowired
	private Course_m2mRepository course_m2mRepository;
	
	public void add(){
		Course_m2m c1 = new Course_m2m("C001","math");
		Course_m2m c2 = new Course_m2m("C002","english");
		Student_m2m s1 = new Student_m2m("小旺","男");
		Student_m2m s2 = new Student_m2m("polly","W");
		Student_m2m s3 = new Student_m2m("shike","M");
		//如果希望在学生表中添加对应的班级编号，需要在班级中添加学生，建立关联关系		
		
		Set<Student_m2m> students1 = new HashSet<Student_m2m>();
		students1.add(s1);
		students1.add(s2);
		
		Set<Student_m2m> students2 = new HashSet<Student_m2m>();
		students1.add(s1);
		students1.add(s3);
		
		c1.setStudent_m2m(students1);
		c2.setStudent_m2m(students2);
		
		student_m2mRepository.save(s1);
		student_m2mRepository.save(s2);
		student_m2mRepository.save(s3);
		course_m2mRepository.save(c1);
		course_m2mRepository.save(c2);
		
//		Set<Course_m2m> courses1 = new HashSet<Course_m2m>();
//		courses1.add(c1);
//		courses1.add(c2);
//		
//		Set<Course_m2m> courses2 = new HashSet<Course_m2m>();
//		courses2.add(c1);
//		courses2.add(c3);
//
//		s1.setCourse_m2m(courses1);
//		s2.setCourse_m2m(courses2);
//		
//		
//		course_m2mRepository.save(c1);
//		course_m2mRepository.save(c2);
//		course_m2mRepository.save(c3);
//		
//		student_m2mRepository.save(s1);
//		student_m2mRepository.save(s2);
		
	}
//	
//	public  void get(){
//		Course_m2m g = grade_o2mRepository.getOne(1);
//		System.out.println(g.getGname() +"  "+g.getGdesc());
//		Set<Student_m2m> students = g.getStudents();
//		for(Student_m2m stu: students){
//			System.out.println(stu.getSname()+"  "+stu.getSex());
//		}
//	}
//	
//	//update学生信息
//	public  void update(){
//		Course_m2m grade = new Course_m2m("2班","软件开发二班");
//		Student_m2m stu = student_o2mRepository.getOne(1);
//		Set<Student_m2m> students = new HashSet<Student_m2m>();
//		students.add(stu);
//		grade_o2mRepository.save(grade);
//	}
//    
//	//delete 学生信息
//	public  void delete(){
//		Student_m2m stu = student_o2mRepository.getOne(1);
//		
//		
//		student_o2mRepository.delete(stu);
//		
//	}
//
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
		
	}
 }
