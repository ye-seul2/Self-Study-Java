package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test9.txt");	//데이터 출발지를 test9.txt로 하는 문자 기반 파일 입력 스트림을 생성
		
		char[] buffer = new char[5];
		
		//입력 스트림으로부터 3개의 문자를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {	//읽은 문자가 있다면
			for(int i=0; i<buffer.length; i++) {	//배열 전체를 읽고 출력
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();	//입력 스트림을 닫음
	}

}
