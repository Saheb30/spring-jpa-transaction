package org.saheb.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "EMP")
public class Emp {
	@Id
	@Column(name = "EMPID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer empid;
	@Column(name = "FIRST_NAME")
	@Size(max=5)
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deptno")
	private Dept dept;

	public Emp() {
	}

	public Emp(String firstName, String lastName, Dept dept) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
