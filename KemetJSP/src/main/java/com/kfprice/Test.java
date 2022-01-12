package com.kfprice;

public class Test {
	
	public static void main(String[] args) {
		JavaBean j1=new JavaBean();
		j1.setEmpName(1000);j1.setEmpId("Kemet");
		
		System.out.println(j1.getEmpId()+"   "+j1.getEmpName());
	}

}
