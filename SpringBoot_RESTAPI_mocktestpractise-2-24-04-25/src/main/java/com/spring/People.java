package com.spring;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class People {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String fname;
	private String lname;
	private int datebirth;
	@OneToOne(cascade=CascadeType.ALL)
	private Bank bank;
	public People() {
		
	}
	public People(Long id) {
		super();
		this.id=id;
	}
	public People(String fname, String lname,int datebirht,Bank bank) {
		super();
		this.fname=fname;
		this.lname=lname;
		this.datebirth=datebirth;
		this.bank=bank;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getDatebirth() {
		return datebirth;
	}
	public void setDatebirth(int datebirth) {
		this.datebirth = datebirth;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
