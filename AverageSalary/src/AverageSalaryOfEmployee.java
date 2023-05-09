import java.util.ArrayList;
import java.util.List;

//Calculate average salary of employees using stream api
public class AverageSalaryOfEmployee {
	
	//lets create an Employee class

	public static void main(String[] args) {

		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("sachin",5000));
		employees.add(new Employee("karan",10000));
		
		double average = employees.stream()
		         .mapToDouble(Employee::getSalary)
		         .average()
		         .orElse(0);
		System.out.println(average);
		//expected answer is 7500
		
	}

}
