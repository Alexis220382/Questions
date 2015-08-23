
package com.sssss.dao;

import com.sssss.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//This will make easier to autowired
@Repository("EmployeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Transactional(readOnly = false)
	public void saveEmployee(Employee employee) {
		hibernateTemplate.saveOrUpdate(employee);

	}

	@Transactional(readOnly = false)
	public void deleteEmployee(Employee employee) {
		hibernateTemplate.delete(employee);

	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees(Employee employee) {
		return (List<Employee>) hibernateTemplate.find("from "
				+ Employee.class.getName());
	}

	public Employee getEmployeeById(String employeeId) {
		return hibernateTemplate.get(Employee.class, employeeId);
	}
}

