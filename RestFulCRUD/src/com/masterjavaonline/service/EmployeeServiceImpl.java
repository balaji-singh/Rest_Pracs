package com.masterjavaonline.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.masterjavaonline.model.Employee;
import com.masterjavaonline.util.HibernateUtil;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getAllEmployee() {

		/*
		 * Employee emp1 = new Employee(); emp1.setDept("IT"); emp1.setEmp_age(30);
		 * emp1.setEmp_id(100); emp1.setEmp_name("Bala S Singh");
		 * emp1.setEmp_slary(150000);
		 * 
		 * Employee emp2 = new Employee(); emp2.setDept("IT"); emp2.setEmp_age(32);
		 * emp2.setEmp_id(101); emp2.setEmp_name("Murali"); emp2.setEmp_slary(100000);
		 * 
		 * Employee emp3 = new Employee(); emp3.setDept("IT"); emp3.setEmp_age(33);
		 * emp3.setEmp_id(102); emp3.setEmp_name("Lakshmi K");
		 * emp3.setEmp_slary(200000);
		 * 
		 * List<Employee> listEmployee = new ArrayList<Employee>();
		 * listEmployee.add(emp1); listEmployee.add(emp2); listEmployee.add(emp3);
		 * return listEmployee;
		 */
		return null;
	}

	@Override
	public Employee getEmpById(int id) {

		Session session = null;
		Transaction tx = null;
		try {

			session = HibernateUtil.getSessionfactory().openSession();
			//tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, new Integer(id));

			session.close();
			return employee;
		} catch (HibernateException e) {
			//tx.rollback();
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public int addEmployee(Employee emp) {

		Session session = null;
		Transaction tx = null;
		try {

			session = HibernateUtil.getSessionfactory().openSession();
			tx = session.beginTransaction();

			Employee employee = emp;
			session.save(employee);
			tx.commit();
			session.close();
			return 200;
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

}
