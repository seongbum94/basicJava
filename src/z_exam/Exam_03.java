package z_exam;

public class Exam_03 {
	
	
	/* 3-1
		public static void main(String[] args) {
			int x = 2;
			int y = 5;
			char c = 'A'; // 'A'의 문자코드는 65
			
			System.out.println(1 + x << 33);						//6			x는 2에 1을더해 3이되고 int형 32비트에서 왼쪽으로 
																	//			33번이동하면 32번째는 재자리로 오고 결국 왼쪽으로 1칸만 
																	//			이동하는 결과가 나온다 따라서 011 -> 110 = 6
			System.out.println(y >= 5 || x < 0 && x > 2);			//true		논리연산의 우선순위는 &&>||이므로 오른쪽의 값은 false가되고
																	//			true||false가 되므로 하나만 true 이면 true 가된다.	
			System.out.println(y += 10 - x++);						//13		y = y + 10 - x-- => y = 15 - 2++
																	//			=> y = 13 (x=3)
			System.out.println(x += 2);								// 5		위에서 x를 증가시켰으므로 x = 3+2 => 5가된다.
			System.out.println( !('A' <= c && c <='Z') );			//false		'A'와 c는 같은 A이므로 true이고 'A'는 'Z'보다 작기때문에
																	//			true이므로 &&는 둘다 true 이면 true가되고 
																	//			!이 붙어서 false가된다
			System.out.println('C'-c);								//2			'C' - 'A' = 67 - 65 = 2
			System.out.println('5'-'0');							//5			5의 유니코드 - 0의 유니코드 => 53-48=5
			System.out.println(c+1);								//66		'A'는 65 => 65+1 = 66
			System.out.println(++c);								//B			'A'를 한단계 올리면 'B'가된다
			System.out.println(c++);								//B			c를 출력하고 한단계올리므로 'B'가된다
			System.out.println(c);									//C			다시 c를 출력하면 한단계올라간 'C'가 된다.
			
			}
		*/
	
	
		
		/*public static void main(String[] args) {
			int numOfApples = 123; // 사과의 개수
			int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//			int numOfBucket = numOfApples % sizeOfBucket == 0 ? numOfApples
//				/ sizeOfBucket : numOfApples / sizeOfBucket + 1; 		// 모든 사과를 담는데 필요한 바구니의 수 
			int numOfBucket = (int)(numOfApples/10.0f+0.9);															// 사과갯수%바구니크기 가 0이면 사과갯수/바구니크기를 표현하고
																		// 사과갯수%바구니크기 가 0이아니면 사과갯수/바구니크기 +1을 한다.
			System.out.println("필요한 바구니의 수 :"+numOfBucket);
		}*/
	
	
	
		// 3-3
		/*public static void main(String[] args) {
			
			int num = 10;
			
			System.out.println( num==0?0:(num>0?"양수":"음수"));	//삼항연산자를 두번 사용하여 num이 0이면 0을출력하고 
																//아니라면 두번째삼항연산자로가서 num이 0보다 크면 양수, 
																//아니면 음수를 출력한다.
		}*/
		
	/*  3-4
		public static void main(String[] args) {
			int num = 456;
			System.out.println( (num / 100) * 100 );	//백의자리 이하를 버리려면 100으로 나눠서 
														//백의자리수만 남기고 다시 100을 곱한다.
		}
	*/	
	
	/* 3-5
	public static void main(String[] args) {
		int num = 333;
		System.out.println (num/10*10+1);			//10을 나누고 다시 10을 곱하면 1의자리수는 
													//0이되고 1을 더하면 1의자리는 1이된다.
		}
	*/
	
	
	 /*	3-6
	 public static void main(String[] args) {
		 int num = 24;								num을 10으로 나눈 나머지를 10에서 빼면 값이나온다.
		 System.out.println( 10-num%10);
	 }
	*/ 
	 
	 
	
	
	// 3-7
	/*public static void main(String[] args){
		int fahreheit = 100;
	//	float celcius = (fahreheit-32)*(5f/9);			//float형으로 담기위해 소수점과f를 붙여주거나 형변환 해준다.
		float celcius = (int)((fahreheit-32)*(5f/9)*100+0.5)/100f;			//소수점 둘째자리까지반올림하기위해 100을 곱하고 0.5를 더한뒤 100으로 나눈다. 
			System.out.println("Fahreheit : "+fahreheit);
			System.out.println("Celcius : "+celcius);
	}*/
	
	// 3-8
/*	 public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);					//byte + byte 는 int + int 가 되기때문에 byte c에 저장하기위해서 byte로 형변환해준다.
		char ch = 'A';
		ch = (char)(ch + 2);					//char + int 는 int + int 로 연산되기때문에 char로 형변환해준다.
		float f = (float)3/2;						//둘다 int 형이어서 하나를 float형으로 바꿔주면 float으로 연산한다.
		long l = 3000l * 3000 * 3000;			//long형은 숫자끝에 l을 붙여서 long형임을 표시해야한다. 기본형이 double이기때문 앞에서부터 연산되기때문에 앞에l을 붙인다.
		float f2 = 0.1f;						
		double d = 0.1f;						//double의 리터럴끝에 f를 붙여주면 float형으로 표현되기때문에 비교하면 true가 나온다.
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}*/
	 	
	// 3-9
	/*public static void main(String[] args) {
		char ch = 'z';
		boolean b = ( 'A'<= ch && ch <= 'Z' || 'a' <= ch && 'z' <= 'z' || '0' <= ch && ch <= '9' );
		System.out.println(b);
		
		
	}*/
	
	// 3-10
	/*public static void main(String[] args) {
		char ch = 'D';
		char lowerCase = ( 'A' <= ch && ch <= 'Z' ) ? (char)(ch+32) : ch;		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		//대문자 A부터 Z까지의 범위에 ch가들어간다면 대문자이고 ch에 32를 더하면 대문자로 바뀐다. 
		//또한 char + int는 int형으로 바뀌었으므로 다시 char로 형변환 시켜준다.
	}*/

	
	
	
	
	
}