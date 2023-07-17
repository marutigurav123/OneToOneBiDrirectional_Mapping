package com.hibernatesBank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Adhar {
	@Id
	private int id;
	private long ano;
	@OneToOne
	@JoinColumn
	private Bank b;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public Bank getB() {
		return b;
	}
	public void setB(Bank b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Adhar [id=" + id + ", ano=" + ano + ", b=" + b + "]";
	}
}
