package com.viva.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="viva_emp")
@DynamicUpdate
public class Emp {
	
	@Id
	@Column(name="emo_id")
	 private int empId;
	@Column(name="emo_name", length=25)
	 private String empName;
	@Column(name="emo_sal")
	 private double sal;
	@Column(name="emo_dept")
	 private String dept;
	@Column(name="emo_doj")
	 private LocalDate doj;
	
	@Column(name="emo_img" ,length=30)
	 private String empImg="dummy.jpg";
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	
	public String getEmpImg() {
		return empImg;
	}
	public void setEmpImg(String empImg) {
		this.empImg = empImg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId +" "+ empName+" "+ sal+" "+dept+" "+doj+" "+empImg;
	}
	 
	 
	 
}
