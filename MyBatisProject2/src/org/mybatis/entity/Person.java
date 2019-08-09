package org.mybatis.entity;

import java.io.Serializable;

public class Person implements Serializable{
	private int id;
	private String name;
	private int age;
	private boolean sex;
	private personcard card;
	public Person() {
		super();
		
	}
	
	public Person(int id, String name, int age, boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person(int id, String name, int age, boolean sex, personcard card) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.card = card;
	}
	public personcard getPersoncard() {
		return card;
	}

	public void setPersoncard(personcard personcard) {
		this.card = personcard;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex 	+ "]\n";
	}

	
	
	
}
