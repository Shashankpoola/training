import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	private int empNo;
	private String ename;
	private double salary;

	public Employee(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException { // Externally controlled by coder

		out.writeInt(empNo); // using writeInt to write empNo through constructor in ExterDemo class
		out.writeUTF(ename);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		empNo = in.readInt(); // using readInt So, we will get only empNo and ename.
		ename = in.readUTF();

	}

}
