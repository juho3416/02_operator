package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

//	public void practice1() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.printf("인원수 : ");		
//		int numP = sc.nextInt();  
//		
//		System.out.printf("사탕개수 : ");
//		int numC = sc.nextInt();
//		
//		int result1 = numC / numP;
//		int result2 = numC % numP;	
//
//		System.out.printf("1인당 사탕 개수 : %d\n", result1);
//		System.out.printf("남는 사탕 개수 : %d\n", result2);
//		
//		System.out.println();
//		System.out.println();
//		
//	}
//	
//	
//	
//	
//	public void practice2() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름 : ");
//		String ireum = sc.next();
//		
//		System.out.print("학년(정수만) : ");
//		int haknyeon = sc.nextInt();
//		
//		System.out.print("반(정수만) : ");
//		int ban = sc.nextInt();
//		
//		System.out.print("번호(정수만) : ");
//		int beonho = sc.nextInt();
//		
//		System.out.print("성별(남학생/여학생) : ");
//		String seongbyeol = sc.next();
//		
//		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
//		Double seongjeok = sc.nextDouble();
//		
//		System.out.println();
//
//		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", haknyeon, ban, beonho, ireum, seongbyeol, seongjeok);
//		
//		System.out.println();
//		System.out.println();
//		
//	}
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int gukeo = sc.nextInt();
		
		System.out.print("영어 : ");
		int yeongeo = sc.nextInt();
		
		System.out.print("수학 : ");
		int suhak = sc.nextInt();
		
		System.out.println();		
		
		int hapgye = gukeo+yeongeo+suhak ;
		int pyeonggyun = (gukeo+yeongeo+suhak)/3 ;
		
		System.out.printf("합계 : %d\n", gukeo+yeongeo+suhak);
		System.out.printf("평균 : %.1f\n", (double)( (gukeo+yeongeo+suhak)/3) );		
		
		System.out.println( (gukeo>=40 && yeongeo>=40 && suhak>=40 && pyeonggyun>=60) ? "합격" : "불합격" );
		
		System.out.println();
		System.out.println();
	
	}
	
	
	
	
}
