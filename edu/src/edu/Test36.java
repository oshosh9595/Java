package edu;

public class Test36 {
	public static void main(String[] args) {
		char letter = 'A';
		int n = (int) letter;
		System.out.println(n); //() <-- 캐스팅 ()안에타입으로 바꿔주는것
		char[] alphabet = new char[26];
		
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (letter + i);
		}
		
		for(char c : alphabet) {
			System.out.print(" " + c);
		}
	}
}
