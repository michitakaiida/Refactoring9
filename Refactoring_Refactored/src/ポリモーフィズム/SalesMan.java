package �|�����[�t�B�Y��;

public class SalesMan extends EmployeeType{

	@Override
	int getTypeCode() {
		// TODO Auto-generated method stub
		return EmployeeType.salesMan;
	}

	int payAmount(Employee emp) {
		return emp.monthlySalary + emp.commission;
	}
}
