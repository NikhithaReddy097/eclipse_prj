package student_grade;

public class Student {
	private String name,grade;
	private int marks[];
	
	public Student() {
		super();
	}
	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = new int[3];
		for(int i=0;i<3;i++)
			this.marks[i] = marks[i];
	}
	
	
}
