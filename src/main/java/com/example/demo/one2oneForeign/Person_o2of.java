package com.example.demo.one2oneForeign;

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
public class Person_o2of implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="iid", unique=true)
	private IdCard_o2of idCard_o2of;
	public Person_o2of() {
		super();
	}
	public Person_o2of(String name) {
		super();
		this.name = name;
	}
	
}
