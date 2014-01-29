package com.ourownjava.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ourownjava.spring.web.model.Employee;

/**
 * 
 * @author ourownjava.com
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController 
{
	@RequestMapping(value= "/findById/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Employee findByID(@PathVariable("id") final String id){
		return new Employee(id, "Doe, John");
	}
}
