package com.ruby.java.ch09;

import java.util.Calendar;
import java.util.Date;
// 자동 임포트 쉬프트+ 컨트롤+ o << 
public class Test17 {
	public static void main(String[] args) throws InterruptedException {
			//Date d = new Date();
			//System.out.println(d);
			
			//Calendar c = Calendar.getInstance();
			
			//System.out.print(c.get(Calendar.YEAR));
			//System.out.print(c.get(Calendar.MONTH) + 1);
			//System.out.print(c.get(Calendar.DAY_OF_MONTH));
			//System.out.print(c.get(Calendar.HOUR));
			//System.out.print(c.get(Calendar.MINUTE));
			
			//System.out.print(c.get(Calendar.YEAR) + "년" + c.get(Calendar.MONTH) + 1 + "월"
			//		+ c.get(Calendar.DAY_OF_MONTH) + "일" + c.get(Calendar.HOUR) + "시" + c.get(Calendar.MINUTE) + "분" );
			
			for(int i = 0; i < 10; i++) {
				Calendar c = Calendar.getInstance();
				System.out.println(c.get(Calendar.YEAR) + "년" + c.get(Calendar.MONTH) + 1 + "월"
						+ c.get(Calendar.DAY_OF_MONTH) + "일" + c.get(Calendar.HOUR) + "시" 
						+ c.get(Calendar.MINUTE) + "분" + c.get(Calendar.SECOND) + "초" );
				Thread.sleep(1000); 
			}
			 
	}
}