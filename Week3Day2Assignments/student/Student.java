package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("student name is Akila.R");
	}
	
	public void studentDept()
	{
		System.out.println("Student Deparment :ComputerScience");
	}
	
	public void studentId()
	{
		System.out.println("Student Id: 10002");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s=new Student();
		  s.studentName();
		  s.studentId();
		  s.studentDept();
          
		  Department d=new Department();
			d.collegeCode();
			d.collegeName();
			d.collegeRank();
			d.deptName();
	}

}
