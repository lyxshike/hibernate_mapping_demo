package com.example.demo.many2one;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name="student_m2o")
public class Student_m2o implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String sex;
	@ManyToOne
	private Grade_m2o grade;
	public Student_m2o(String sname, String sex, Grade_m2o grade) {
		super();
		this.sname = sname;
		this.sex = sex;
		this.grade = grade;
	}
	


}
