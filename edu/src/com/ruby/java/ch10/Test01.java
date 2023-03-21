package com.ruby.java.ch10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add("런던"); list.add("북경"); list.add("방콕");
		list.add("북경"); list.add("도쿄"); list.add("서울");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
