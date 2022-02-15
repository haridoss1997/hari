package org.samble;

public class Staff {
	private void StaffId() {
		System.out.println("staffid is 765");

	}
	private void StaffName() {
		System.out.println("Staff name is arun");

	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.StudentId();
		stu.StudentName();
	
	Staff sta = new Staff();
	sta.StaffId();
	sta.StaffName();

}
}