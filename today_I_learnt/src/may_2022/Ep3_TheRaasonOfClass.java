package may_2022;

class Print{ 
	public static String delimiter = "";  
	
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
}

public class Ep3_TheRaasonOfClass {

	 
	// 클래스는 왜 존재해야 할까? 클래스는 왜 필요할까? 그 이유를 잘 생각해보자.
	
	public static void main(String[] args) {
		Print.delimiter = "-------";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
			
		
		Print.delimiter = "******";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		
		
	}
	

}
