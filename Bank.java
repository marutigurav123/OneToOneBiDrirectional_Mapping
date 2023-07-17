package com.hibernatesBank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Bank {
	@Id
	private int id;
	private String bname;
	private String badress;
	@OneToOne(mappedBy="b")
	private Adhar adhar;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBadress() {
		return badress;
	}
	public void setBadress(String badress) {
		this.badress = badress;
	}
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", bname=" + bname + ", badress=" + badress + ", adhar=" + adhar + "]";
	}
}
