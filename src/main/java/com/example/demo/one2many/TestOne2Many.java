package com.example.demo.one2many;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/*
 * 单项1对多关联关系（班级-->学生） 
 *  建立关联关系后，可以方便的从一个对象导航到另一个对象
 *  注意关联的方向
 * */
//@Component
public class TestOne2Many implements CommandLineRunner{
	
	@Autowired
	private Student_o2mRepository student_o2mRepository;

	@Autowired
	private Grade_o2mRepository grade_o2mRepository;
	
	public void add(){
		Grade_o2m g = new Grade_o2m("1班","软件开发一班");
		Student_o2m s1 = new Student_o2m("小旺","男");
		Student_o2m s2 = new Student_o2m("小红","女");
		
		//如果希望在学生表中添加对应的班级编号，需要在班级中添加学生，建立关联关系
		
		Set<Student_o2m> students = new HashSet<Student_o2m>();
		students.add(s1);
		students.add(s2);
		
		g.setStudents(students);
		
		student_o2mRepository.save(s1);
		student_o2mRepository.save(s2);
		grade_o2mRepository.save(g);
	    System.out.println(s1.toString());
	}
	
	public  void get(){
		Grade_o2m g = grade_o2mRepository.getOne(1);
		System.out.println(g.getGname() +"  "+g.getGdesc());
		Set<Student_o2m> students = g.getStudents();
		for(Student_o2m stu: students){
			System.out.println(stu.getSname()+"  "+stu.getSex());
		}
	}
	
	//update学生信息
	public  void update(){
		Grade_o2m grade = new Grade_o2m("2班","软件开发二班");
		Student_o2m stu = student_o2mRepository.getOne(1);
		Set<Student_o2m> students = new HashSet<Student_o2m>();
		students.add(stu);
		grade_o2mRepository.save(grade);
	}
    
	//delete 学生信息
	public  void delete(){
		Student_o2m stu = student_o2mRepository.getOne(1);
		
		
		student_o2mRepository.delete(stu);
		
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		add();
		get();
		update();
		//delete();   为什么delete不成功呢， 因为有外键约束的哦
		
	}
 }
