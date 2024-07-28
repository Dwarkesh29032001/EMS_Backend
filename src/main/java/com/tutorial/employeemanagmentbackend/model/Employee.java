package com.tutorial.employeemanagmentbackend.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Employee_Record")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    private String empFullName;

    private String empMobile;

    private String empDepartment;

    private String empPhotoId;

    private String empAddLine1;

    private String empAddLine2;

    private String empDistrict;

    private String empTehsil;

    private String empCity;

    private String empPinCode;
    
    
   
    private Date empStartDate;
   
    private Date empEndDate;

    private String empDesignation;

    private int empSalary;

    private String empUserId;

    private String empPassword;
    

    public Employee() {
    }


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpFullName() {
		return empFullName;
	}


	public void setEmpFullName(String empFullName) {
		this.empFullName = empFullName;
	}


	public String getEmpMobile() {
		return empMobile;
	}


	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}


	public String getEmpDepartment() {
		return empDepartment;
	}


	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}


	public String getEmpPhotoId() {
		return empPhotoId;
	}


	public void setEmpPhotoId(String empPhotoId) {
		this.empPhotoId = empPhotoId;
	}


	public String getEmpAddLine1() {
		return empAddLine1;
	}


	public void setEmpAddLine1(String empAddLine1) {
		this.empAddLine1 = empAddLine1;
	}


	public String getEmpAddLine2() {
		return empAddLine2;
	}


	public void setEmpAddLine2(String empAddLine2) {
		this.empAddLine2 = empAddLine2;
	}


	public String getEmpDistrict() {
		return empDistrict;
	}


	public void setEmpDistrict(String empDistrict) {
		this.empDistrict = empDistrict;
	}


	public String getEmpTehsil() {
		return empTehsil;
	}


	public void setEmpTehsil(String empTehsil) {
		this.empTehsil = empTehsil;
	}


	public String getEmpCity() {
		return empCity;
	}


	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}


	public String getEmpPinCode() {
		return empPinCode;
	}


	public void setEmpPinCode(String empPinCode) {
		this.empPinCode = empPinCode;
	}


	public Date getEmpStartDate() {
		return empStartDate;
	}


	public void setEmpStartDate(Date empStartDate) {
		this.empStartDate = empStartDate;
	}


	public Date getEmpEndDate() {
		return empEndDate;
	}


	public void setEmpEndDate(Date empEndDate) {
		this.empEndDate = empEndDate;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpUserId() {
		return empUserId;
	}


	public void setEmpUserId(String empUserId) {
		this.empUserId = empUserId;
	}


	public String getEmpPassword() {
		return empPassword;
	}


	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

    
}
