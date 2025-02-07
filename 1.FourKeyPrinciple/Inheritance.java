// Inheritance Example

//Parent class
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}


//Child class inheriting Animal
class Dog extends Animal {
	void barks() {
		System.out.println("Dogs barks.");
	}
}


public class Inheritance {
	public static void main(String[] args){
		Dog d = new Dog();
		d.eat();  //Inherited from Animal
		d.bark(); //Defined in Dog class
	}
}
