package ポリモーフィズム;

abstract class EmployeeType {

	static final int engineer = 1;
	static final int salesMan = 2;
	static final int manager = 3;

	abstract int getTypeCode();
}
