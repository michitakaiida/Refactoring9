package ポリモーフィズム;

public class Manager extends EmployeeType {

	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return EmployeeType.manager;
	}

	int payAmount(Employee emp) {
		return emp.monthlySalary +emp.bonus;
	}
}
