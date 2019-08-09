package org.mybatis.entity;

import java.util.List;

public class personClass {
	private int classId;
	private String className;
	private List<Person> persons;
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	@Override
	public String toString() {
		return "personClass [classId=" + classId + ", className=" + className + ", persons=" + persons + "]\n";
	}

	
}
