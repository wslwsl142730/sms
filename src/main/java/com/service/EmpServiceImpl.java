package com.service;

import com.dao.EmpDao;
import com.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empservice")
@Transactional
public class EmpServiceImpl implements EmpService {

/*	@Autowired
	private EmpService empService;*/
	@Autowired
	private EmpDao empDao;
	
	public List<Employees> queryAll() {
		List<Employees> queryAll = empDao.queryAll();
		return queryAll;
	}

	public void deleteById(Integer id) {

		empDao.deleteById(id);
	}

	public void update(Employees employees) {

		empDao.update(employees);
	}

	public void insert(Employees employees) {
		empDao.insert(employees);
	}

	public Employees queryByTeId(int id) {

		Employees queryByTeId = empDao.queryByTeId(id);
		return queryByTeId;
	}

}
