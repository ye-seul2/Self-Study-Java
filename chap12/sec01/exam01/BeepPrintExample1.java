package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();    //비프음 발생
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
