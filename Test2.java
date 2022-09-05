package com.sh.test;

/**
 * 2. 자신의 신상정보를 저장할 변수를 만들고 정보를 변수에 대입, 출력하는 프로그램을 작성하세요.
      (System.out.printf 사용할것.)
     - 이름, 나이, 성별,주소, 전화번호, 이메일      

=======================================================================
이름        나이    성별       전화번호            이메일            주소
=======================================================================
홍길동        22        남        01012341234       hgd@naver.com    경기도 광주시
홍길순        20        여        010123412341   hgs@gmail.com    전라남도 광주시                            

작성한 변수를 재사용해 팀메이트의 정보를 다시 변수에 대입 출력하는 프로그램으로 수정하세요.
 */
	public class Test2 {
		
		public static void main(String[] args) {
			Test2 information = new Test2();
			information.chart();
		}

		
		public void chart( ) {
			String name = "아무나";
			String age = "31";
			String gender = "남";
			String phone = "010555555555";
			String email = "000000@00000.com";
			String address = "지구 대한민국";
			
		
				System.out.println("================================================================");
				System.out.printf("%s%6s%4s%8s%15s%15s\n","이름","나이","성별","전화번호","이메일","주소");
				System.out.println("================================================================");
				System.out.printf("%s%5s%5s%15s%20s%10s\n", name , age , gender, phone , email , address);
				
			name = "아무개";
			age = "27";
			gender = "남";
			phone = "00000000000";
			email = "000000@00000.com";
			address = "지구 대한민국";	
			
				System.out.printf("%s%5s%5s%15s%20s%10s\n", name , age , gender, phone , email , address);
				
		}
}
