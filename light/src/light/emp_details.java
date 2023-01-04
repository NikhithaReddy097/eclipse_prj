package light;
import java.util.*;
public class emp_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		employee data[] = new employee[7];
		data[0] = new employee(1001,20000,8000,3000,"Ashish","01/04/2009","R&D",'e');
		data[1] = new employee(1002,30000,12000,9000,"Sushma","23/08/2012","PM",'c');
		data[2] = new employee(1003,10000,8000,1000,"Rahul","12/11/2008","Acct",'k');
		data[3] = new employee(1004,12000,6000,2000,"Chahat","29/01/2013","Front desk",'r');
		data[4] = new employee(1005,50000,20000,20000,"Ranjan","01/04/2009","Engg",'m');
		data[5] = new employee(1006,23000,9000,4400,"Suman","01/1/2005","Manufacturing",'e');
		data[6] = new employee(1007,29000,12000,10000,"Tanmay","11/04/2006","PM",'c');

		d_allow d[] = new d_allow[5];
		d[0] = new d_allow('e',"Engineer",20000);
		d[1] = new d_allow('c',"Consultant",32000);
		d[2] = new d_allow('k',"Clerk",12000);
		d[3] = new d_allow('r',"Receptionist",15000);
		d[4] = new d_allow('m',"Manager",40000);
		
		System.out.println("Enter number of employees : ");
		int n = sc.nextInt();
		int f[] = new int[n];
		System.out.println("Enter employee id : ");
		for(int i=0;i<n;i++)
		    f[i] = sc.nextInt();
		System.out.println("Emp No. \t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");

		for(int k=0;k<n;k++) {
			boolean found = false;
			for(int i=0;i<data.length;i++) {
				if(data[i].getEmp_no() == f[k]) {
					int salary = data[i].getBasic()+data[i].getHra()-data[i].getIt();
					char ch = data[i].getCode();
					String s="";
					for(int j=0;j<d.length;j++) {
						if(d[j].getDcode() == ch) {
							s = d[j].getDesig();
							salary += d[j].getDA();	
						}
					}
					System.out.println(f[k]+"\t\t"+data[i].getEmp_name()+"\t\t"+data[i].getDepartment()+"\t\t\t"+s+"\t\t\t"+salary);
					found = true;
				}
			}
			if(!found) {
				System.out.println("There is no employee with empid "+f[k]);
			}
		}
		sc.close();
	}
}
class employee{
	int emp_no,basic,hra,it;
	String emp_name,date,department;
	char code;
	
	public employee(int emp_no, int basic, int hra, int it, String emp_name, String date, String department,char code) {
		this.emp_no = emp_no;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
		this.emp_name = emp_name;
		this.date = date;
		this.department = department;
		this.code = code;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public int getBasic() {
		return basic;
	}
	public int getHra() {
		return hra;
	}
	public int getIt() {
		return it;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public String getDate() {
		return date;
	}
	public String getDepartment() {
		return department;
	}
	public char getCode() {
		return code;
	}
}
class d_allow{
	char dcode;
	String desig;
	int DA;
	
	public d_allow(char dcode, String desig, int dA) {
		this.dcode = dcode;
		this.desig = desig;
		DA = dA;
	}
	public char getDcode() {
		return dcode;
	}
	public String getDesig() {
		return desig;
	}
	public int getDA() {
		return DA;
	}
}
