package com.projhibernate.HibernateAnnotation;


public class Name {

private String firstName;
 private String middleName;
 private String lastName;
public String getFirstNasme() {
	return firstName;
}
public void setFirstNasme(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	

}
