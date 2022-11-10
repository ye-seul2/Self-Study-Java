package sec01.exam03;

public class A {
	//인스턴스 필드와 메소드
	int field1;
	void method1() { }
	
	//정적 필드와 메소드
	static int field2;
	static void method2() { }
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			//모든 필드와 메소드에 접근할 수 있음
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//인스턴스 필드와 메소드는 접근할 수 없음
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
