// Encapsulation Example

class Student{
	private String name; // Private variable
	

	//Getter method
	public String getName(){
		return name;
	}


	//Setter method 
	public void setName(String newName) {
		this.name = newName;
	}
}


public class Encapsulation{
	public static void main(String[] args){
		Student s = new Student();
		s.setName("Nikhil");
		System.out.println(s.getName());
	}
}
