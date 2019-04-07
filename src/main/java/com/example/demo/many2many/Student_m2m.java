package com.example.demo.many2many;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_m2m")
public class Student_m2m implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String sex;
	
	@ManyToMany(mappedBy="student_m2m")
	private Set<Course_m2m> course_m2m;
	
	
	public Student_m2m(String sname, String sex) {
		super();
		this.sname = sname;
		this.sex = sex;
	}
	


}
