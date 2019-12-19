package org.saheb.repo;

import org.saheb.vo.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer>{
	
}
