package Question_1;

class Emp {
	String Name = "Hrushikesh";
	int id = 10;
	double sal = 25000;
	String Address = "Abc Apartment, abc street";

	public Emp(String name, int id, double sal, String address) {
		super();
		Name = name;
		this.id = id;
		this.sal = sal;
		Address = address;
	}

	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", id=" + id + ", sal=" + sal + ", Address=" + Address + "]";
	}

	public void display_info() {
		System.out.println("Name: " + Name);
		System.out.println("ID: " + id);
		System.out.println("Salary: " + sal);
		System.out.println("Address: " + Address);
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Hrushikesh", 20, 1000, "ABC street");
		emp.display_info();

		System.out.println(emp);
	}
}
