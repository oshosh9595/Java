package edu.ex;

public class Test01 {
	public static void main(String[] args) {
		
		double a = -9.81;
		double x = 1000.0;
		double t = 5.0;
		double v = 0.0;
		
		double xt = 0;
		
//		for(t = 0; t < 10; t++) {
//			xt = 0.5 * a * t*t + v*t + x;
//			System.out.println(t + "초 후 위치 :" + xt +"m");
//		}

		while(true) {
			xt = 0.5 * a * t*t + v*t + x;
			if (xt < 0.0) break;
			//System.out.println(t + "초 후 위치 :" + xt +"m");
			System.out.printf("%.1f초 후 위치 : %.2fm\n", t, xt);
			t += 0.5;
		}
		
	}
}
