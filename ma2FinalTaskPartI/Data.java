package ma2FinalTaskPartI;

public class Data {
	private String name, number, address;
	private int age, math, sci, english, history, pe;
	
	
	//Stters for student data
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//Setters for grades
	public void setMath(int grade) {
		this.math = grade;
	}
	
	public void setSci(int grade) {
		this.sci = grade;
	}
	
	public void setEng(int grade) {
		this.english = grade;
	}
	
	public void setHistory(int grade) {
		this.history = grade;
	}
	
	public void setPE(int grade) {
		this.pe = grade;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getSci() {
		return this.sci;
	}
	public int getEng() {
		return this.english;
	}
	public int getHistory() {
		return this.history;
	}
	public int getPE() {
		return this.pe;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
