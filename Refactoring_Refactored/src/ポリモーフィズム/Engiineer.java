package ポリモーフィズム;

public class Engiineer extends EmployeeType {

	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return EmployeeType.engineer;
	}

	int payAmount(Employee emp) {
		return emp.monthlySalary;
	}
}
