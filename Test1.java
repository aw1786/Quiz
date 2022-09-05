package com.sh.test;

	public class Test1 {

		public static void main(String[] args) {
			Test1 study = new Test1();
			study.note1();
				
		}
		/**
		 * 1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
		     - 정수형 100, 9999억, 
		       - 실수 486.567(float), 567.890123
		       - 문자 A
		       - 문자열 Hello world, 
		       - 논리 true  
		     단, 변수를 이용하여 출력하시오 .
		     com.sh.test.Test1 에 작성
		 */		
	public void note1( ) {
		int inum;
		long lnum;
		float fnum;
		double dnum;
		char ch;
		String str;
		boolean bool;
			
			inum = 100;
			lnum = 999999999999L;
			fnum = 486.567f;
			dnum = 567.890123;
			ch ='A';
			str = "Hello world";
			bool =	true;	
				
				System.out.println("정수형 : " + inum +"," + lnum);
				System.out.println("실수형 : " + fnum +"(float)," + dnum);
				System.out.println("문자 : " + ch);
				System.out.println("문자열 : " + str);
				System.out.println("논리 : " + bool);
			
		}
}
