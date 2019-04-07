package com.example.demo.o2m_m2o;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name="student_o2m_m2o")
public class Student_o2m_m2o implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	@Column
	private String sname;
	@Column
	private String sex;
	@ManyToOne(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="gid")
	private Grade_o2m_m2o grade_o2m_m2o;
	public Student_o2m_m2o(String sname, String sex) {
		super();
		this.sname = sname;
		this.sex = sex;
	}
	


}
