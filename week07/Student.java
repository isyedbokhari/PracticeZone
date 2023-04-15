package week07;

public class Student {
	private String name;
	private int age;
	private String grade;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void study() {
		System.out.println(name + " is " + age + " years old. He / she is "
				+ "a hardworking student and always gets " + grade + " grade.");
	}
	
	
}
