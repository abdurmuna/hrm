package com.bs.hrm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeSub {
	
	private long 			employeeId;
	private	String 			NID;
	private	String 			fingerId;
	private String  		fullName;
 	private String	    	nickName;
 	private Double	    	basicSalary;

}
