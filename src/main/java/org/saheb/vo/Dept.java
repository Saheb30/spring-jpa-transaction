package org.saheb.vo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="DEPT")
public class Dept {
	@Id
	@Column(name = "DEPTNO")
	private Integer deptNo;
	@Column(name = "DNAME")
	private String deptName;
	@Column(name = "LOC")
	private String location;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dept")
	private Set<Emp> emps = new HashSet<>();

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
}
