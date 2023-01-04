package student_grade;
import java.util.*;
public class student_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> s = new ArrayList<Student>();
		System.out.println("Enter the number of students : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter student name : ");
			String name = sc.next();
			System.out.println("Enter 3 subjects marks: ");
			int m[] = new int[3];
			for(int j=0;j<3;j++) {
				m[i] = sc.nextInt();
			}
			s.add(new Student(name,m));
		}
		student_report sr = new student_report();
		System.out.println("Students grades are : ");
		for(int i=0;i<n;i++) {
			try {
				if(sr.validate(s.get(i)).equals("Valid")) {
					sr.findGrades(s.get(i));
					System.out.println(s.get(i).getName()+" = "+s.get(i).getGrade());
				}
			}
			catch(Exception e) {}
		}
		sc.close();

	}

}
