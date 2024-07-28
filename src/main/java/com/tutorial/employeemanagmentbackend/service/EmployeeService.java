package com.tutorial.employeemanagmentbackend.service;

import com.tutorial.employeemanagmentbackend.model.Employee;
import com.tutorial.employeemanagmentbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "empId"));
    }

    @Override
    public Employee updateEmployee(int empId, Employee employee) {
        Employee employeeToUpdate = employeeRepository.findById(empId).orElseThrow();
        employeeToUpdate.setEmpFullName(employee.getEmpFullName());
        employeeToUpdate.setEmpMobile(employee.getEmpMobile());
        employeeToUpdate.setEmpDepartment(employee.getEmpDepartment());
        employeeToUpdate.setEmpPhotoId(employee.getEmpPhotoId());
        employeeToUpdate.setEmpAddLine1(employee.getEmpAddLine1());
        employeeToUpdate.setEmpAddLine2(employee.getEmpAddLine2());
        employeeToUpdate.setEmpDistrict(employee.getEmpDistrict());
        employeeToUpdate.setEmpTehsil(employee.getEmpTehsil());
        employeeToUpdate.setEmpCity(employee.getEmpCity());
        employeeToUpdate.setEmpPinCode(employee.getEmpPinCode());
        employeeToUpdate.setEmpStartDate(employee.getEmpStartDate());
        employeeToUpdate.setEmpEndDate(employee.getEmpEndDate());
        employeeToUpdate.setEmpDepartment(employee.getEmpDepartment());
        employeeToUpdate.setEmpDesignation(employee.getEmpDesignation());
        employeeToUpdate.setEmpSalary(employee.getEmpSalary());
        employeeToUpdate.setEmpUserId(employee.getEmpUserId());
        employeeToUpdate.setEmpPassword(employee.getEmpPassword());
        
        return employeeRepository.save(employeeToUpdate);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
