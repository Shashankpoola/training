import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {

//			Employee e1 = null;
//			
//			System.out.println("salary  "+ e1.getSalary());
//			
			
			
			Manager m1= new Manager("mike", 500, 2000);
			
			
			Clerk c1= new Clerk("read", 5000, 200);
			 
			
			
			showSalary(m1);
			showSalary(c1);
			
	}

	private static void showSalary(Employee e) {
		if(e instanceof Manager)
		System.out.println("Manager Salary 	" +e.getSalary());
		else 
			System.out.println("Clerk Salary	" +e.getSalary());
		
	}
   
		
	

}
