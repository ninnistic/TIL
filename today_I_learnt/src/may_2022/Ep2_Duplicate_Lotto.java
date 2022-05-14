package may_2022;
 
import java.util.Random;

public class Ep2_Duplicate_Lotto {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(45) +1;	
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					 i--;
					 break;
				}
				
			}
		    
		}
		for (int i = 0; i < lotto.length-1; i++) {
			for(int j = i+1; j< lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
					
		}
		System.out.println();

	}

}
