package com.example.demo.one2oneForeign;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Getter
@Setter
@Entity
public class IdCard_o2of implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iid;
	
	@Column
	private String cardNo;
	
	
	public IdCard_o2of(String cardNo) {
		super();
		this.cardNo = cardNo;
	}


	public IdCard_o2of() {
		super();
	}
	
	
}
