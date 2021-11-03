package javaBuoi8OOP;

import java.io.Serializable;

public class Student implements Cloneable, Comparable<Student>, Serializable {
	String fullName;
	String birthDate;
	char gender;
	double gpa;
	int socialActivities;
	
	@Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }
	
	@Override
	public String toString() {
		return "fullName: " + fullName + ", birthDate: " + birthDate + ", gender: " + gender + ", gpa: " + gpa
				+ ", socialActivities: " + socialActivities;
	}

	public Student() {
		
	}
	
	public Student(String fullName, String birthDate, char gender, double gpa, int socialActivities) {
		super();
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.gpa = gpa;
		this.socialActivities = socialActivities;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getSocialActivities() {
		return socialActivities;
	}
	public void setSocialActivities(int socialActivities) {
		this.socialActivities = socialActivities;
	}
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		
		if(this.getGpa() == s.getGpa() && this.getSocialActivities() == s.getSocialActivities())
			return 0;
		if(this.getGpa() > s.getGpa())
			return 1;
		else if(this.getGpa() == s.getGpa()) {
			if(this.getSocialActivities() > s.getSocialActivities())
				return 1;
		}

		return -1;
	}

	
	
	
	
}



