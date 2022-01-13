package com.kfprice.ems.main;

import java.util.List;

import com.kfprice.ems.dto.Employee;
import com.kfprice.ems.exceptions.EmployeeNotFoundException;
import com.kfprice.ems.service.EmployeeServiceImpl;
import com.kfprice.ems.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		IEmployeeService eservice = new EmployeeServiceImpl();
		eservice.addEmployee(new Employee(1111, "A", "Manager", 28));
		eservice.addEmployee(new Employee(2222, "B", "Clerk", 30));
		eservice.addEmployee(new Employee(3333, "C", "Salesman", 29));
		eservice.addEmployee(new Employee(4444, "D", "Accountant", 30));
		
		System.out.println("  ");
		
			  List<Employee> elist = eservice.showAllEmployee();
			  for(Employee e : elist) {
				  System.out.println(e.getEmpid()+":"+e.getEmpname()+":"+e.getDesignation()+":"+e.getDaysAttended());
			  }
		System.out.println("   ");
		
		eservice.deleteEmployee(1111);
		
		eservice.updateEmployee(new Employee(2222,"updated","Sr.Clerk",29));
		
		try {
			Employee temp = eservice.findEmployee(new Employee(2222,"updated","Sr.Clerk",29));
			System.out.println(temp.getEmpid()+" "+temp.getEmpname());
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
