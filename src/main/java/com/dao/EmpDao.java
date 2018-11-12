package com.dao;

import com.entity.Employees;

import java.util.List;

public interface EmpDao {
	public List<Employees> queryAll();
	
	public void deleteById(Integer id);
	
	public void update(Employees employees);
	
	public void insert(Employees employees);
	
	public Employees queryByTeId(int id);
}
