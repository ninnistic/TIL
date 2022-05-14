package may_2022;

public class Ep1_Array_Delete_N_Insert {

	public static void main(String[] args) {
		// 배열

		int[] arr2 = { 1, 2, 3, 4, 5 };
		int size = 5;

		for (int i = 0; i < size; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("==============");

		// 2를 삭제하고 싶다.
		//arr2[1] = 0;

		//배열 삭제 알고리즘

		// 1번지의 2를 삭제하고 싶어요. 

		/*int delTarget = 1;
		arr2[delTarget] = arr2[delTarget + 1]; // 1번지에 2번지의 값을 넣는
		delTarget++; // 그리고 2번지에 3번지의 값을 넣기 위해 1증가시킴(반복하기 위해)
		arr2[delTarget] = arr2[delTarget + 1];
		delTarget++;
		arr2[delTarget] = arr2[delTarget + 1];
		delTarget++;
		// 언제까지 해야할까? : 배열 마지막 -1 까지, 왜냐하면 4번지에 있으면 복사해올 5번지의 값이 없다...이 배열에서는
		// 따라서, 배열 마지막 -1 (여기서는 4)까지해줘야 4가 5의 값을 받아오고 그 자리를 채운다.*/

		//따라서 이렇게 만들어주면 됩니다.
		int delTarget = 1;
		for (delTarget = 1; delTarget < arr2.length - 1; delTarget++) {
			arr2[delTarget] = arr2[delTarget + 1];
		}
		size --; // 삭제했으니까 사이즈도 하나 줄여준다. (배열의 길이를 하나 적게 출력한다)

		/* for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		 // 근데 이렇게하면 1,3,4,5,5 가 출력되는데 나는 1,3,4,5만 출력하고 싶어 그래서 우리는 
		//배열의 길이를 size로 관리해주는거야. */
		for(int i = 0; i < size; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
