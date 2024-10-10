package Question_2;
class Employee{
	public void salary() {
		System.out.println("Salary: 12000");
	}
	public void salary(int salary) {
		System.out.println("Salary: "+salary);
	}
}

class Accounts extends Employee{
	@Override
	public void salary(int salary) {
		// TODO Auto-generated method stub
		super.salary(salary);
	}
	
}
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary();
		employee.salary(10000);
		
		Accounts accounts = new Accounts();
		accounts.salary(15000);
	}

}
