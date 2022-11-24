package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
List<String> list = new ArrayList<String>();
		
		list.add("Java"); // string 객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // 저장된 총 객체수 얻기
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
	}
	System.out.println();
	
	list.remove(2);
	list.remove(2);
	list.remove("iBATIS");
	
	for(int i=0; i<list.size(); i++) {
		String str = list.get(i);
		System.out.println(i + ":" + str);
		}
	}

}
