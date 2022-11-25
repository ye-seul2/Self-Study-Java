package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("입력하세요: ");
			String lineStr = br.readLine();	//라인 단위로 문자열을 읽음
			if(lineStr.equals("q") || lineStr.equals("quit")) break;	//q또는 quit를 읽었을 때 while 반복문 종료
			System.out.println("입력된 내용: " +  lineStr);
			System.out.println();
		}
		
		br.close();    //입력 스트림 닫기
	}

}
