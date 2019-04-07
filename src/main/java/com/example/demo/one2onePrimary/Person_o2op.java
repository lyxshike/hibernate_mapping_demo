package com.example.demo.one2onePrimary;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name="person_o2op")
public class Person_o2op implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne
	private IdCard_o2op idCard_o2op;
	public Person_o2op() {
		super();
	}
	public Person_o2op(String name) {
		super();
		this.name = name;
	}
	
}
