package com.example.demo.one2onePrimary;

import java.io.Serializable;

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
@Table(name="idCard_o2op")
public class IdCard_o2op implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String cardNo;
	public IdCard_o2op(String cardNo) {
		super();
		this.cardNo = cardNo;
	}
	
	
}
