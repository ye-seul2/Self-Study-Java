package sec02.exam04;

import java.io.*;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		//바이트 기반 출력 스트림을 생성하고 DataOutputStream 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//기본 타입 값 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("감자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close();	//출력 스트림 닫기
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive..db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			//기본 타입 값 읽기
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();	//입력 스트림 닫기
	}

}
