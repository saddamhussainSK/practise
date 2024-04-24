package com.spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String bname;
	private int phno;
	public Bank() {
		
	}
	public Bank(Long id) {
		super();
		this.id=id;
	}
	public Bank(String bname,int phno) {
		super();
		this.bname=bname;
		this.phno=phno;
	}
	public Bank(Long id,String bname,int phno) {
		super();
		this.id=id;
		this.bname=bname;
		this.phno=phno;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}	
}
