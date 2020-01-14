
public class Employee {

	private String name = " ";
	private double salary = 0;
	private int yearsExperience = 0;
	public static int numEmployees = 0;
	
	public Employee() {
		name = "???";
		salary = 0.00;
		yearsExperience = 0;
		numEmployees++;
	}
	
	public Employee (String name, double salary, int years) {
		this.name = name;
		this.salary = salary;
		yearsExperience = years;
		numEmployees++;
	}
	
	public Employee (String str) {
		String arr[] = str.split(":",3);
		name = arr[0];
		salary = Integer.parseInt(arr[1]);
		yearsExperience = Integer.parseInt(arr[2]);
		
		numEmployees++;
	}
	
	public String getName( ) {
		return name;
	}
	
	public double getSalary( ) {
		return salary;
	}
	
	public int getYears() {
		return yearsExperience;
	}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	public void addOneYear() {
		yearsExperience++;
	}
	
	public void addYears(int numYears) {
		yearsExperience += numYears;
	}
	
	public void raiseSalary(double byPercent) {
		salary = salary + salary*(byPercent/100);
	}
	
	public Employee moreExperience(Employee e) {
		if (this.yearsExperience < e.yearsExperience) {
			return e;
		}
		else
			return this;
	}
	
	public static int getNumEmployees() {
		return numEmployees;
	}
	
	public String toString() {
		return "Name: "+ name + "\nSalary: $"+ salary + 0 + "\nYears of Experience: "+yearsExperience + " \n";
	}
	
	
	
}
