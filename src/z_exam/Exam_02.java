package z_exam;

public class Exam_02 {
	public static void main(String[] args){

		
		/*					
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
							
		종 류					크 기
				1 byte 		2 byte 		4 byte 		8 byte
		논리형	boolean			
		문자형				char
		정수형	byte		short		int			long
		실수형							float		double
		
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		
		long regNo = 9411121111111L;		정수중 가장큰 long형으로 저장을하고 
											기본4바이트가 아닌 8바이트인 long형임을 표시하기위해 끝에 L을 붙인다.
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		- 리터럴 : 100, 100L, 3.14f			특정한 값 자체
		- 변수 :	i, l						변수
		- 키워드 : int, long, FINAL, float		예약어
		- 상수 : PI							final로 정의되어 변하지않는수
		
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
		a. int
		b. Byte
		c. double
		d. boolean
		
		b의 Byte는 앞글자가 대문자이므로 기본형이 아니다.
		
		*/
		
		
		//[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
		//류’라고 적으시오.
		//System.out.println("1" + "2") → (12)  			문자열 +문자열은 문자열이되서 1과2를합친 "12"가된다.
		
		//System.out.println(true + "") → (true)			boolean + String 형은 String형으로 연산해서 true가 된다.
		
		//System.out.println('A' + 'B') → (131)			A와 B를 숫자로 바꾸면 65, 66이므로 더하면 131이다
		
		//System.out.println('1' + 2) → (51)				'1'의 유니코드는 49이고 2와 더하면 51이다.
		
		//System.out.println('1' + '2') → (99)	 		1과 2의 유니코드는 각각 49,50이므로 더하면 99이다.
		
		//System.out.println('J' + "ava") → (Java)			char는 2바이트 String은 4바이트이므로 
		//												4바이트 연산을 위해 char가 String으로 형변환
		//												하여 String + String으로 진행되서 Java가 된다.
		
		//System.out.println(true + null) → (오류)		null의 타입을 알수없기때문에 더할수없다.
		
		/*
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
		a. if			조건문 키워드 이다
		b. True			자주색으로 빛나지않는다.
		c. NULL			대문자NULL은 키워드가 아니다.
		d. Class		Class의 앞글자가 대문자여서 키워드가 아니다.
		e. System		자주색으로 빛나지않는다.
		
		b, c, d, e
		
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		a. $ystem		특수기호$는 쓸수있다
		b. channel#5	특수기호#은 사용할수없다
		c. 7eleven		앞글자에 숫자는 들어갈수없다
		d. If			앞글자가 대문자이므로 예약어가 아니다
		e. 자바			한글을 쓸수는있으나 최대한 쓰지않는다
		f. new			예약어는 사용할수없다.
		g. $MAX_NUM		특수기호$를 사용하고 상수는 대문자이고 두단어가 붙어있으므로 '_'로 두글자를 구분한다
		h. hello@com	특수기호@는사용할수없다
		
		a, d, e, g
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
		르시오)
		a. int		4byte
		b. long		8byte
		c. short	2byte
		d. float	4byte
		e. double	8byte
		 
		a, d
		
		참조형변수는 4바이트이므로 4바이트는 a,d이다.
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		byte b = 10;		
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		a. b = (byte)i;     		int는 4바이트,  byte는 1바이트이므로 형변환이 필요하다.
		b. ch = (char)b;			char는 0부터 2의 16승-1이므로 byte의 음수구간을 저장할수없어서 형변환이 필요하다.
		c. short s = (short)ch;		char의 양수범위는 2의 16승-1이고 short의 양수범위는 2의 15승-1이므로 
									short는 char의 양수범위를 저장할수없으므로 형변환이 필요하다.
		d. float f = (float)l;		long은 4byte, float은 4byte이므로 형변환을 생략할수있다.
		e. i = ch;					char는 2byte, i의 타입은 int이고 4byte이므로 형변환을 생략할수잇다.
		
		e
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
		char는 2byte타입이므로 16비트를 사용하고 음수가 없으므로 0부터 2의 16승 에서 1을 뺀 값이다.
		0~2^16-1 -> 65535
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
		a. byte b = 256;	byte의 범위는 -128~127까지이다
		b. char c = '';			문자 1개를 가져야하기때문에 아무것도적지않아서 잘못초기화됬다.
		c. char answer = 'no';	char는 한개의 단어만 입력받는다.
		d. float f = 3.14		끝에 ;이 없고 float형은 끝에 F가 붙어야한다.
		e. double d = 1.4e3f;	
		
		a,b,c,d
		
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
		a. boolean - false	기본값이다.
		b. char - '\u0000'	유니코드값이다.
		c. float - 0.0		끝에 F를 붙여야한다
		d. int - 0			
		e. long - 0			끝에 L을 붙여야한다
		f. String - ""		
		
		c, e
		

		
		*/
		char a = '\u0000';
		System.out.println(a);
		
	}

}