package may_2022;

public class Ep3_TheRaasonOfClass {
	
	
	// 클래스는 왜 존재해야 할까? 클래스는 왜 필요할까? 그 이유를 잘 생각해보자.
	
	public static void main(String[] args) {
		delimiter = "-------";
		printA();
		printA();
		printB();		
		printB();		
		
		delimiter = "******";
		printA();
		printA();
		printB();		
		printB();	
		
		
		
	}
	public static String delimiter = "";
	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}
