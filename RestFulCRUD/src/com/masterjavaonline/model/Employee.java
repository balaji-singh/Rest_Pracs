/**
 * 
 */
package com.masterjavaonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author balasingh
 *
 */
@Entity
@Table(name = "Employee_Tab")
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int emp_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "dept")
	private String dept;

	@Column(name = "emp_age")
	private int emp_age;

	@Column(name = "emp_slary")
	private int emp_slary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_name, String dept, int emp_age, int emp_slary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.dept = dept;
		this.emp_age = emp_age;
		this.emp_slary = emp_slary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_slary() {
		return emp_slary;
	}

	public void setEmp_slary(int emp_slary) {
		this.emp_slary = emp_slary;
	}

}
