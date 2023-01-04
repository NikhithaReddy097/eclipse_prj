package student_grade;

public class student_report {
	public String findGrades(Student s) {
		int marks[] = s.getMarks();
		int sum = 0;
		
		for(int i=0;i<marks.length;i++) {
//			if(marks[i]<35) {
//				s.setGrade("F");
//				return "F";
//			}
			sum += marks[i];
		}
		System.out.println(sum);
		if(sum<150)
			s.setGrade("C");
		else if(sum<200)  
			s.setGrade("B");
		else if(sum<250) 
			s.setGrade("A");
		else 
			s.setGrade("A+");
		return s.getGrade();
	}
	
	public String validate(Student s) throws NullStudentObjectException,NullNameException,NullMarksException{
		
		if(s==null)
			throw new NullStudentObjectException("Object is null");
		else {
			if(s.getName()==null)
			    throw new NullNameException("Name is null");
		    else if(s.getMarks()==null)
			    throw new NullMarksException("Marks are null");
		    else
		        return "Valid";
		}
	}
}

