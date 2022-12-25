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


    Scanner scr = new Scanner(System.in);
    ArrayList<EmployeePayroll> employeePayrolls = new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayrollService service = new EmployeePayrollService();
        service.readData();
        service.writeData();

    }
//read the data........
    public void readData(){
        EmployeePayroll employeePayroll = new EmployeePayroll();
        System.out.println("Enter Employee id: ");
         employeePayroll.setId(scr.nextInt());
        System.out.println("Enter Employee Name: ");
        employeePayroll.setName(scr.next());
        System.out.println("Enter Employee Salary: ");
        employeePayroll.setSalary(scr.nextInt());
        employeePayrolls.add(employeePayroll);

    }
//writing the data
    public void writeData(){
        System.out.println(employeePayrolls);
  }
}

