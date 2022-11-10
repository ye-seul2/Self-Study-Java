package sec01.exam06;

public class Button {
	//인터페이스 타입 필드
	OnClickListener listener;
	
	//매개 변수의 다형성
	void setOnClickLstener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();    //구현 객체의 onClick() 메소드 호출
	}
	
	//중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}	
