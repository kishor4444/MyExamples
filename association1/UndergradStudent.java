package com.association1;

public class UndergradStudent extends Student{
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void takenAdmissionin()
	{
		Branch br=new Branch();
		br.studiesBranch();
	}
	public void joinedSociety()
	{
		Society c1=new Society();
		c1.collegeSociety();
		
	}
	

}
