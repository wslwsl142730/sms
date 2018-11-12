package com.controller;

import com.entity.Employees;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("insert")
	public String insert(Employees emp){
		empService.insert(emp);
		return "redirect:/emp/queryAll";
	}
	
	@RequestMapping("update")
	public String update(Employees emp){
		empService.update(emp);
		return "redirect:/emp/queryAll";
		
	}
	
	@RequestMapping("deleteById")
	public String deleteById(int id){
		empService.deleteById(id);
		return "redirect:/emp/queryAll";
	}
	
	@RequestMapping("queryAll")
	public String queryAll(HttpServletRequest request){
		List<Employees> queryAll = empService.queryAll();
		request.setAttribute("list", queryAll);
		return "emplist";
	}
	@RequestMapping("queryByTeId")
	public String queryByTeId(HttpServletRequest request , int id){
		Employees emp = empService.queryByTeId(id);
		request.setAttribute("emp", emp);
		return "updateEmp";
	}
	

}
