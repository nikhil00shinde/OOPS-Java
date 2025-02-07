class MathUtils {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c){
		return a + b + c;
	}
}

public class Polymorphism {
	public static void main(String[] args){
		MathUtils obj = new MathUtils();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(2, 3, 4));
	}
}
