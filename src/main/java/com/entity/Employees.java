package com.entity;

import java.util.Date;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;
	private Integer age;
	private Date bir;
	private String sex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBir() {
		return bir;
	}
	public void setBir(Date bir) {
		this.bir = bir;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(Integer id, String name, Double salary, Integer age,
			Date bir, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.bir = bir;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", age=" + age + ", bir=" + bir + ", sex=" + sex + "]";
	}
	

}
