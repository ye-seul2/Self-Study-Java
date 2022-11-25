package sec02.exam02;

import java.io.*;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		//기본 스트림 생성
		String originalFilePath1 =
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//버퍼 보조 스트림
		String originalFilePath2 =
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//FileInputStream, FileOutputStream을 이용한 복사 시간 측정
		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		//BufferdeInputStream, BufferedOutputStream을 이용한 복사 시간 측정
		long bufferTime = copy(bis,bos);
		System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();		//시작 시간 저장
		//[파일 복사] 원본 파일에서 읽은 1byte를 타깃 파일로 바로 출력
		while(true) {
			data = is.read();
			if(data == -1)break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();	//끝 시간 저장
		return (end-start);	//복사에 걸린 시간 리턴
	}

}
