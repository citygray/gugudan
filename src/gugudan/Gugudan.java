package gugudan;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 	사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
			예를 들어 사용자가 8이라는 숫자를 입력하면 8단 전체를 계산해 출력한다.
			사용자가 2 이상, 9 이하가 아닌 값을 입력하는 경우 "2이상, 9이하의 값만 입력할 수 있습니다."라는 메시지를 출력한다.
		*/
		/*
		System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		if(!((1<number)&&(number<10))) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		}else {
			System.out.println(number+"단");
			for(int i=1;i<10;i++) {
				System.out.println(number+"*"+i+"="+number*i);
			}
		}
		*/
		
		
		/*
		 *  학습 목표
			- 배열을 활용해 구구단을 구현하는 경험을 한다.
			요구사항
			- 구구단 결과을 배열에 저장한 후 배열의 결과를 출력한다.
		 */
		/*
		int number = 2;
			
		//2단을 구현하기 위해 크기가 9인 배열을 생성한다.
		int[] result = new int[9];
		
		//for문을 돌면서 구구단 실행 결과를 배열에 저장한다.
		for(int i=0; i<result.length; i++) {
			result[i] = number*(i+1);
		}
		
		//배열의 크기 만큼 for 문을 통해 결과를 출력한다.
		for(int i=0; i<result.length; i++) {
			System.out.println(number+"*"+(i+1)+"="+result[i]);
		}
		*/
		
		
		/*
			요구사항
			- 2~9단 까지 전체 출력
		 */
		
		int[] result = new int[9];
		for(int j=2; j<10; j++) {
			System.out.println(j+"단");
			for(int i=0; i<result.length; i++) {
				result[i] = j*(i+1);
				System.out.println(j+"*"+(i+1)+"="+result[i]);
			}
			System.out.println("-----------------------------");
		}
		
	}

}
