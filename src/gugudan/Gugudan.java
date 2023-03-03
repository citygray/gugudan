package gugudan;

import java.util.Scanner;

public class Gugudan {
	
	/*
		학습 목표
		- 메소드를 활용해 구구단을 구현하는 경험을 한다.
		요구사항
		- 구구단을 구현하기 위해 반복적으로 발생하는 부분이 있다.
		- 반복적으로 발생하는 부분을 메소드를 활용해 반복되는 부분을 줄인다.
		힌트
		- 구구단 계산 결과를 배열에 담는 로직을 새로운 메소드로 분리한다.
		- 배열에 담은 데이터를 화면에 출력하는 로직을 새로운 메소드로 분리한다.
	*/
	//구구단 계산 결과를 배열에 담는 로직을 새로운 메소드로 분리한다.
	public static int[] calculate(int times) {
		int[] result = new int[9];
		
		//for문을 돌면서 구구단 실행 결과를 배열에 저장한다.
		for(int i=0; i<result.length; i++) {
			result[i] = times*(i+1);
		}
		return result;
	}
	//배열에 담은 데이터를 화면에 출력하는 로직을 새로운 메소드로 분리한다.
	public static void print(int[] result, int j) {
		for(int i=0; i<result.length; i++) {
			System.out.println(j+"*"+(i+1)+"="+result[i]);
		}
	}

	public static void main(String[] args) {
		
		for(int j=2; j<10; j++) {
			// calculate와 print 메소드 활용해 구구단 구현하기
			print(calculate(j), j);
			System.out.println("-----------------------------");
		}
		
	}

}
