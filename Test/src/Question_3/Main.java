package Question_3;

abstract class Hospital{
	void empid() {
		System.out.println("Name : Harry");
		System.out.println("EmpID : 222074");
	}
	static void bonus() {
		System.out.println("Bonus: 5000");
	}
	abstract void salary();
}

class Management extends Hospital{
	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary + bonus = 15000 ");
	}
}

public class Main {
public static void main(String[] args) {
	Management management = new Management();
	management.empid();
	Management.bonus();
	management.salary();
}
}
