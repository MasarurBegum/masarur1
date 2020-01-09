package org.cts.test.login;

public class Employee 
{
private void empId()
{
System.out.println("Employee id is 123");
}
private void empName() {
System.out.println("Employee name is masarur");
}
private void empDob() {
System.out.println("Employee dob is 20.05.96");
}

private void empPhno() {
System.out.println("Employee phno is 563473483873");
}
private void empMail() {
System.out.println("Emp mail is masarur@gmail.com");
}
private void empAddress() {
System.out.println("Emp address is assam");
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhno();
	e.empMail();
	e.empAddress();
}
}