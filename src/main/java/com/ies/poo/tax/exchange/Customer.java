package com.ies.poo.tax.exchange;

public class Customer {
	private String name;
	private String cpf;
	private Integer age;
	private Character sex;
	
	public Customer(String name, String cpf, Integer age, Character sex) {
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}
	
	
}
