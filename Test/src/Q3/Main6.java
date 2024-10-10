package Q3;


interface PolicyImp{
	double sal(double sal, double bonus);
	
	double sal(double sal, double bonus, double tax);
	
}

abstract class Acc implements PolicyImp{
	
	 @Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal + bonus;
	}
	 
	 @Override
	public double sal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Employee1 extends Acc{
	@Override
	public double sal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.sal(sal, bonus);
	}
}
public class Main6 {
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1();
		System.out.println(employee1.sal(1000, 2500));
	}
}