package edu.kh.op.ex;

public class ExampleRun { // 코드 실행용 클래스
	
	// 메인 메서드 필수 작성
	public static void main(String[] args) {
		
		// OpExample 생성
		// Scanner sc = new Scanner(System.in); 처럼
		// Scanner는 사용자가 입력한 것을 받아들여서 하는 것이라 
		// System.in(input)이 필요하지만
		// 그렇지 않은 경우는 필요가 없음.
		
		OpExample ex = new OpExample();
		// 같은 패키지(edu.kh.op.ex) 안에 있는 클래스는
		// import를 하지 않아도 불러다 쓸 수 있다 (에러X)
		
	// ex.ex1(); // ex가 가지고 있는 ex1() 메서드 실행
		// Ctrl 누르고 ex1 쪽에 마우스 대보면 추적 가능
		
	// ex.ex2();
		
	// ex.ex3();
		
	//	ex.ex4();
	
	//	ex.ex5();
		
	//	ex.ex6();
		
	//	ex.ex7();
		
		ex.ex8();
		
		
	}
	
}
