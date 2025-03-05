package day1and2nd.polymorphism;

public class Student {
	private int studentId;
	private String studentName;
	private String department;
	private String gender;
	private String category;
	private double collegeFee;
	
	// Getter method for all variables
	public int getStudentId()
	{
		return this.studentId;
	}
	
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public double getCollegeFee()
	{
		return this.collegeFee;
	}
	
	// Setter method for all variables
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public void setCollegeFee(double collegeFee)
	{
		this.collegeFee = collegeFee;
	}

	public Student(int studentId, String studentName, String department, String gender, String category,
			double collegeFee) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.gender = gender;
		this.category = category;
		this.collegeFee = collegeFee;
	}

	





}
