package com.example.demo.oneAoneForeign;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Person_oAof implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="iid", unique=true)
	private IdCard_oAof idCard_oAof;
	public Person_oAof() {
		super();
	}
	public Person_oAof(String name) {
		super();
		this.name = name;
	}
	
}
