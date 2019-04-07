package com.example.demo.oneAonePrimary;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name="idCard_oAop")
public class IdCard_oAop implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String cardNo;
	
	@OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
	private Person_oAop person_o2op;
	
	public IdCard_oAop(String cardNo) {
		super();
		this.cardNo = cardNo;
	}
	
	
}
