package com.example.demo.o2m_m2o;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="grade_o2m_m2o")
public class Grade_o2m_m2o implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int gid;
	@Column(nullable=true)
	private String gname;
	@Column
	private String gdesc;
	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="gid") // 没有这一行的话，hibernate会多生成一个表来存对应关系的。
	private Set<Student_o2m_m2o> students;
	public Grade_o2m_m2o(String gname, String gdesc) {
		super();
		this.gname = gname;
		this.gdesc = gdesc;
	}
	
	
}
