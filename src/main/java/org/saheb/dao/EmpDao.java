package org.saheb.dao;

import java.util.List;
import java.util.Set;

import org.saheb.repo.EmpRepository;
import org.saheb.vo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Service
public class EmpDao {

	@Autowired
	private EmpRepository empRepository;

	public void getAllEmployees() {
		System.out.println("inside getAllEmployees");
		List<Emp> empList = empRepository.findAll();
		System.out.println("List size->" + empList.size());
		for (Emp emp : empList) {
			System.out.println(emp.getFirstName());
		}
	}

	@Transactional(rollbackFor=RuntimeException.class,propagation=Propagation.REQUIRES_NEW)
	public void insertEmp(Set<Emp> empSet) {
		System.out.println("Inside insert");
		for (Emp temp : empSet) {
			Emp temp2 = empRepository.save(temp);
			System.out.println("inserted-->" + temp2.getFirstName());
		}
	}

}
