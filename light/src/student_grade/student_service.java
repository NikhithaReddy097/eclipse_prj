package student_grade;
public class student_service {

}
class NullStudentObjectException extends Exception  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public NullStudentObjectException (String str)  
    {  
        super(str);  
    }

	@Override
	public String toString() {
		return "Object is null";
	}  
	
}
class NullNameException extends Exception  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public NullNameException (String str)  
    {  
        super(str);  
    }

	@Override
	public String toString() {
		return "Name is null";
	}  
	
}
class NullMarksException extends Exception  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public NullMarksException (String str)  
    {  
        super(str);  
    }

	@Override
	public String toString() {
		return "Marks is null";
	}  
	
}
