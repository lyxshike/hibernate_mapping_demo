package com.example.demo.compositeKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="personInfo")
public class PersonInfo implements Serializable {
	@EmbeddedId
	private Address address;
	@Column
	private String lover;
}
