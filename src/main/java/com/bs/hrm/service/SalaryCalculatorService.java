package com.bs.hrm.service;

import com.bs.hrm.dto.MonthlySalary;
import com.bs.hrm.dto.TotalSalary;

public interface SalaryCalculatorService {

	public MonthlySalary calculateMonthlySalary();
	
	public TotalSalary	calculateTotalSalary();
	
}
