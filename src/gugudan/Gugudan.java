package gugudan;


public class Gugudan {
	
	
	//	최종 요구사항 2
	//	사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
	//  예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 
	//	팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
	
	public static void calculate(int firstInt,int secondInt) {
		int[] result = new int[secondInt];
		for(int i=1; i< firstInt; i++) {
			for(int j=0; j<result.length; j++) {
				result[j] = (i+1)*(j+1);
				System.out.println((i+1)+"*"+(j+1)+"="+result[j]);
			} 
			System.out.println("------------------------");
		}

	}
	
}
