package com.example.demo.oneAoneForeign;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode
@Getter
@Setter
@Entity
public class IdCard_oAof implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iid;
	
	@Column
	private String cardNo;
	
	@OneToOne(mappedBy="idCard_oAof")
	private Person_oAof person_oAof;
	
	public IdCard_oAof(String cardNo) {
		super();
		this.cardNo = cardNo;
	}


	public IdCard_oAof() {
		super();
	}
	
	
}
