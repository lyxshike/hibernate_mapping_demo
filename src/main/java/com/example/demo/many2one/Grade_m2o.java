package com.example.demo.many2one;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="grade_m2o")
public class Grade_m2o implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int gid;
	@Column(nullable=true)
	private String gname;
	@Column
	private String gdesc;
	public Grade_m2o(String gname, String gdesc) {
		super();
		this.gname = gname;
		this.gdesc = gdesc;
	}
	
}
