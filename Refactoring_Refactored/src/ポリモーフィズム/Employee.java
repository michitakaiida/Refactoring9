package ポリモーフィズム;

public class Employee {
	private int type;
	int monthlySalary = 10000;
	int commission =1000;
	int bonus = 1500;
	
	public Employee(int typeCode) {
		this.type = typeCode;
	}
	
	int payAmount() {
		switch (getType()) {
		case EmployeeType.engineer:
			return monthlySalary;

		case EmployeeType.salesMan:
			return monthlySalary + commission;

		case EmployeeType.manager:
			return monthlySalary +bonus;
			
			default:
				throw new RuntimeException("不正な従業員");
		}
	}

	private int getType() {
		// TODO Auto-generated method stub
		return this.type;
	}

}
