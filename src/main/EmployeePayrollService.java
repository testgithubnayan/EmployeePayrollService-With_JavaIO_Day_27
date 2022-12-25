package com.bridgelabz.fileio;

import java.util.List;

public class EmployeePayrollService {
	public enum IOService {
		CONSOLE_IO, FILE_IO
	}

	private final List<EmployeePayrollData> employeePayrollDataPayrollList;

	public EmployeePayrollService(List<EmployeePayrollData> list) {

		this.employeePayrollDataPayrollList = list;
	}

	public PayrollService getPayrollServiceObject(IOService ioType) {
		PayrollService payrollService = null;
		if (IOService.FILE_IO.equals(ioType)) {
			payrollService = new FileIOPayrollService();
		}
		return payrollService;
	}

	public void writeData(IOService ioType) {
		PayrollService payrollService = getPayrollServiceObject(ioType);
		payrollService.writeData(employeePayrollDataPayrollList);
	}

	public void readData(IOService ioType) {
		PayrollService payrollService = getPayrollServiceObject(ioType);
		payrollService.readData();
	}

	public long countEntries(IOService ioType) {
		PayrollService payrollService = getPayrollServiceObject(ioType);
		return payrollService.countEntries();
	}
}

