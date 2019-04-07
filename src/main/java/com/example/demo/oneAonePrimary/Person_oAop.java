package com.example.demo.oneAonePrimary;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name="person_oAop")
public class Person_oAop implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne
    @PrimaryKeyJoinColumn
	private IdCard_oAop idCard_o2op;
	public Person_oAop() {
		super();
	}
	public Person_oAop(String name) {
		super();
		this.name = name;
	}
	
}
