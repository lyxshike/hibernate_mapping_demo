package com.example.demo.many2many;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
@Table(name="course_m2m")
public class Course_m2m implements Serializable {
	@Id
	@GeneratedValue(generator="cid")
	@GenericGenerator(name="cid",strategy="assigned")
	@Column(length=4)
	private String cid;
	@Column(nullable=true)
	private String cname;
	@ManyToMany
	@JoinTable(
			name="course_student",
			joinColumns= {@JoinColumn(name="cid")},
			inverseJoinColumns= {@JoinColumn(name="sid")}
			)
	private Set<Student_m2m> student_m2m;
	
	
	public Course_m2m(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	

	
	
	
}
