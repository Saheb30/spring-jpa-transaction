package org.saheb.service;

import java.util.LinkedHashSet;
import java.util.Set;

import org.saheb.dao.EmpDao;
import org.saheb.vo.Dept;
import org.saheb.vo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	private EmpDao empDao;

	//@Transactional(rollbackFor = Exception.class)
	public void insertSingleBatch() {
		try {
			empDao.getAllEmployees();
			Set<Emp> empSet = new LinkedHashSet<>();
			Dept dept = new Dept();
			dept.setDeptNo(10);
			empSet.add(new Emp("abc", "abc", dept));
			empSet.add(new Emp("xyz", "xyz", dept));
			empSet.add(new Emp("def", "def", dept));
			empSet.add(new Emp("pqrstu", "pqr", dept));
			empDao.insertEmp(empSet);// Spring create a new transaction every time insertEmp method is called
		} catch (Exception e) {
			System.out.println("Exception in batch1.." + e.getMessage());
		}
		empDao.getAllEmployees();

	}

	//@Transactional
	private void insertMultibatch() {
		try {
			empDao.getAllEmployees();
			Set<Emp> empSet = new LinkedHashSet<>();
			Dept dept = new Dept();
			dept.setDeptNo(10);
			empSet.add(new Emp("abc", "abc", dept));
			empSet.add(new Emp("xyz", "xyz", dept));
			empDao.insertEmp(empSet);// Spring create a new transaction every time insertEmp method is called
		} catch (RuntimeException e) {
			System.out.println("Exception in batch1.." + e.getMessage());
		}
		try {
			Set<Emp> empSet = new LinkedHashSet<>();
			Dept dept = new Dept();
			dept.setDeptNo(10);
			empSet.add(new Emp("def", "def", dept));
			empSet.add(new Emp("pqrstu", "pqr", dept));
			empDao.insertEmp(empSet);
		} catch (RuntimeException e) {
			System.out.println("Exception in batch2.." + e.getMessage());
		}
		empDao.getAllEmployees();
	}
}
