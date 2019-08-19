package a_variable;
		
public class VarialbeType {
	public static void main(String[] args){
			/*
		 	변수의 타입
		 
		 	1. 기본형(primitive type)
		 	-boolean, char, byte, short, int, long, float, double
		 
		 
		 	2. 참조형(reference type)
		 	- 8개의 기본형을 제외한 나머지 타입
		 	- 객체의 주소를 저장한다
		 	3. 종류
		  	- 논리형 : true, false 중 하나의 값을 가지며 조건식과 논리적 계산에 사용된다.
		  	 		ex) boolean
		  	- 문자형 : 문자 하나를 저장하는데 사용된다.
		  			ex) char
		  	- 정수형 : 정수값을 저장하는데 사용된다.
		  			ex) byte, short, int, long
		  	- 실수형 : 실수형값을 저장하는데 사용된다.
		  			ex) float, double
		  			
		 	4. 기본형 변수의 크기(1byte = 8bit)
		 	-1byte : boolean, byte
		 	-2byte : char, short
		 	-4byte : int, float
		 	-8byte : long, double
		 	
		 	5. boolean(기본값 false)
		 	-boolean형 변수에는 true, false를 저장할수있다.
		 	-boolean형 변수는 대답(yes, no), 스위치(on/off)
		 	-데이터를 저장하는 최소단위가 1byte이므로 1byte의 크기를 가진다.
		 	
		 	6. 문자형 - char
		 	- 문자 하나를 저장하기위해 사용한다. 'A'
		 	- 정수형으로 표현이 가능하다.
		
		 	7.정수형 - byte, short, int, long
		 	- 대표 자료형은 int이다
		 	- byte나 short의 경우 크기가 작아서 범위를 넘어서 
		 	   잘못된결과를 얻기쉽다. -> int형을 사용하는 것이 좋다.
		 	-jvm의 피연산자 스택이 피연산자를 4byte단위로 저장하기 때문에 4byte형보다
		  	  작은 녀석들의 연산시에 4byte형태로 변환하여 연산한다.
		 	
		 	8. 실수형 - float, double
		 	-대표 자료형은 double
		 	-실수형값을 저장하는데 사용된다.
		 	-float : 1+8+23
		 	 doublt : 1+11+52
		 	-실수형에서는 자료형을 선택할대 값을 범위뿐만 아니라 정밀도 도 중요한 요소가된다.
		 	
		 	
		 	
		 	
		 	
		 	
		 
		  	*/
		  	//변수 ab를 true의 값으로 초기화 해주세요
		
			boolean ab = true;
			//변수 ab를 'p'의 값으로 초기화해주세요
			
			char ac = 'p';
		  
			//byte형 변수 ad에 5000의 값을 저장해주세요
			
			short ad = 5000;
			
			
			//변수 power를 false의 값으로 초기화해주세요
			
			boolean power = false;
			
			//power의 값으 true로 변경해주세요
			
			power = true;
			
			char aa = 'A';
			char ba = 65;
			char ca = '\u0041';			//유니코드 특수문자
			
			System.out.println(ca);

			String str1 = "==========\n---------"; //줄바꿈
			String str = "==========\t---------";  //tab
			System.out.println(str1);
			System.out.println(str);
			
			//1.byte형 변수에 51을 저장해주세요
			
			byte b = 51;
				
			//2.short형 변수에 500000을 저장해 주세요
				
			short s = 5000;
				
			//3.int형 변수에 20억을 저장해주세요
			
			int i = 2000000000;
				
			//4.long형 변수에 50억을 저장해주세요
				
			long l = 5000000000L;
				
			//1. float타입의 변수에 3.1415921265898113을 저장해주세요
			
			float f = 3.1415921265898113F;
			System.out.println(f);
				
			//2. double타입의 변수에 3.14159212658968113을 저장해주세요

			double d = 3.1415921265898113;
			System.out.println(d);
			
			
			byte b2 = 126;
			System.out.println(b2);
			b2++;
			System.out.println(b2);
			b2++;
			System.out.println(b2);
			//over flow
			// 변수 자신이 저장할수있는 범위를 넘었을때 최소값부터 다시 표현하는 현상
			
			
			/*
			9. 형변환(casting)
			  -기본형 변수간에는 형변환이 가능하다.
			 
			  byte -> short -> int -> long -> float -> double
			  		  char  ->  ^
			 */
			
			//1. short 타입의 변수에 600의 값을 저장해 주세요
			
			short a2 = 600;
			
			//2. int 타입의 변수에 5000을 저장해주세요
			
			int ss2 = 50000;
			
			//3. char타입의 변수에 'T'를 저장해 주세요.
			
			char xx = 't';
			
			//4. a2의 값을 byte타입의 변수에 저장해 주세요
			byte b4 = (byte)a2;
			//5. ss2의 값을 char타입의 변수에 저장해주세요
			char ss3 = (char)ss2;
			//6. xx의 값을 int타입에 저장해주세요
			int b6 = xx;   				/*char에서 int로 변환은 int의 범위가 더 크므로 
										overflow가 발생하지않아서 casting을 생략할수있다.*/
			
			float ff2 = 3.14F;
			double dd2 = 3.14;
			
			int rr = (int)ff2;
			
			System.out.println(rr);
			
			System.out.println(3+5.0);
			// byte + byte 는 int + int 가 된다. jvm이 4바이트 연산을 하므로..
			
			byte kk = 50;
			byte kk2 = 60;
			char cc = 'A';
			char cc2 = 'C';
			
			int kk3 = kk + kk2;  //byte + byte -> int + int
			
			int kk4 = kk + cc;       //byte + char -> int + int 
			System.out.println(kk4);
			
			
			int cc3 = cc + cc2;		//char + char -> int + int 
			System.out.println(cc3);
			
			
			
	}
}
