package modulo_10;

import java.util.Date;

public class Person {
	private String name;
	private Date dataBirth;
	private String gender;
	private boolean working;
	
	public Person() {
		
	}

	public Person(String name, Date dataBirth, String gender, boolean working) {
		this.name = name;
		this.dataBirth = dataBirth;
		this.gender = gender;
		this.working = working;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDataBirth() {
		return dataBirth;
	}
	
	public void setDataBirth(Date dataBirth) {
		this.dataBirth = dataBirth;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isWorking() {
		return working;
	}
	
	public void setWorking(boolean working) {
		this.working = working;
	}
	
}
