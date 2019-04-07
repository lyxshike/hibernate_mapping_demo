package com.example.demo.compositeKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
@Embeddable
public class Address implements Serializable {
	@Column
	private String name;
	@Column
	private long phoneNum;
	
}
