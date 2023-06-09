package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Iterator;


public class Test02 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		// for (String s : list) 데이터가만출력
		for(int i = 0; i < list.size(); i++) { //숫자등 정확히 표현은 이방법
			System.out.println(list.get(i));
		}
		
		System.out.println("===============");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
