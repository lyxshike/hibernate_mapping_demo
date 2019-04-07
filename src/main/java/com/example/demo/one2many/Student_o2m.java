package com.example.demo.one2many;

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
@Table(name="student_o2m")
public class Student_o2m implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String sex;
	public Student_o2m(String sname, String sex) {
		super();
		this.sname = sname;
		this.sex = sex;
	}
	


}
