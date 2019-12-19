package org.saheb.repo;

import org.saheb.vo.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{

}
