package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");	//데이터 도착지를 test3.db로 하는 바이트 기반 파일 출력 스트림을 생성
		
byte[] array = { 10, 20, 30, 40, 50 };
		
		os.write(array, 1, 3);	//배열의 1번 인덱스부터 3개를 바이트를 출력
		
		os.flush();	//출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();	//출력 스트림을 닫음
	}

}
