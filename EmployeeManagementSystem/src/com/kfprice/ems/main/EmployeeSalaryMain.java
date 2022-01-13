package com.kfprice.ems.main;

import com.kfprice.ems.business.ContractEmployeeSalaryCalculator;
import com.kfprice.ems.business.PermanentEmployeeSalaryCalculator;
import com.kfprice.ems.dto.Employee;
import com.mysql.cj.PerConnectionLRUFactory;

public class EmployeeSalaryMain {
public static void main(String[] args) {
	
	PermanentEmployeeSalaryCalculator pe = new PermanentEmployeeSalaryCalculator();
	
	pe.calculateNetSalary(new Employee(1234,"A","Clerk",28), 30000);
	
	System.out.println("****");
	ContractEmployeeSalaryCalculator ce = new ContractEmployeeSalaryCalculator();
	ce.calculateNetSalary(new Employee(4321,"B","Manager",20), 50000);
}
}
