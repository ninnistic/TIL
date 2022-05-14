package may_2022;

class Accounting  {
    public static double valueOfSupply;
    
    public static double vatRate = 0.1;
 
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
     
    public static double getTotal() {
        return valueOfSupply + getVAT();
    }
}


public class Ep4_ApplicationOfClass {
// 장사를 하는 중인데, 물건가격이 만원이라면, 원가의 10퍼센트의 돈을 더 받아야한다. (부가가치세) 
	
	// Actual class name : AccountingApp
	
	   
	 
	    public static void main(String[] args) {
	    	
	    	Accounting.valueOfSupply = 10000.0;
	        System.out.println("Value of supply : " + Accounting.valueOfSupply);
	        System.out.println("VAT : " + Accounting.getVAT());
	        System.out.println("Total : " + Accounting.getTotal());
	 
	    }
	}

}
