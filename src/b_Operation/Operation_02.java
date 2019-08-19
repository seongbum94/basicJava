package b_Operation;

public class Operation_02 {
	public static void main(String[] args){
		/*
		 1. 증감연산자(++, --)
		    -증가연산자(++) : 피연산자의 값을 1증가시킨다.
		    -감소연산자(--) : 피연산자의 값을 1감소시킨다.
		 
		
		//int형 변수 i에 3의 값을 저장해주세요.
		int i = 3;
		i++;
	
		System.out.println(i);
		++i;
		System.out.println(i);
		
		int j = ++i +3;		//i = 6, j = 8
		
		System.out.println(i);
		System.out.println(j);
	
		int k = 50;
		int t = 20;
		
		int result = k++ + ++t + 10 + ++k; 	// 50 + 21 + 10 + 52 = 133
		System.out.println(k);				// k = 52
		System.out.println(t);				// t = 21
		System.out.println(result);			// result = 133
		/*
		
		
		/*
		 2.부호연산자(+, -)
		   - 부호연산자는 피연산자의 부호를 변경하는데 사용된다.
		   - char, boolean 자료형에는 사용할수 없다.
		 */
		
		int i2 = -10;
		i2 = -12;
		
		/*
		 3.비트전환 연산자(~)
		   -정수형과 char에만 사용가능하다.
		   10   :  00001010 => 10
		   ~10  :  11110101 => -11 (1의 보수)
		   ~10+1:  11110110 => -10 (2의 보수)
		   
		 */
		// ~ (비트)연산의 경우 byte, short, char의 경우 int형으로 변환후 연산한다.
		
		byte b3 = 10;
		int b4 = ~b3;	//1의보수 -11
		//System.out.println(b4);
		
		/*
		 4. 논리부정연산자 ( ! )
		   - boolean형에만 사용 가능하다.
		   - true => false, false => true
		 
		 */
		boolean power = false;
		// power의 값을 부정하여 power변수에 저장해주세요.
		power = !power;
		//System.out.println(power);
		
		/*
		 5. 산술연산자
		   - 사칙연산자(+,-,*,/), 나머지연산자(%), 쉬프트연산자(<<, >>, >>>)
		   		두개의 피연산자를 취하는 이항 연산자이다.
		 
		 6. 사칙연산자(+,-,*,/)
		   - int형보다 작은 자료형간의 연산은 int형으로 형변환후 연산을 수행한다.
		     : byte + short => int + int = int
		   - 두개의 피연산자중 하나이상 4byte형 이상인 경우에는 큰쪽의 자료형에 
		        맞춰서 형변환후 연산을 수행한다.
		     :char + float => float + float = float
		   - 정수형간의 나눗셈은 0으로 나누는것은 금지되어있다.
		 
		 */
		
		byte aa = 1;
		short bb = 129;
		
		//aa와 bb의 합을 변수 cc에 저장해 주세요
		
		int cc = aa + bb;
		
		//aa와 bb의 합을 변수 byte형 변수 dd에 저장해 주세요
		
		byte dd = (byte)(aa + bb);
		
		/*
		7, 나머지연산자
		  - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려주는 연산자
		  - boolean형을 제외한 모든 기본자료형에 사용가능하다.
		
		 */
		int firstNum = 10;
		int secondNum = 3;
		
		//firstNum을 secondNum으로 나눈 결과를 share라는 변수에 저장해 주세요
		
		int share = firstNum/secondNum;  //몫
		//firstNum을 secondNum으로 나눈 나머지를 remain라는 변수에 저장해 주세요
		int remain = firstNum%secondNum;
		
		//10을 3으로 나눈 몫은 3이고 나머지는 1이다
		System.out.println(firstNum + "을 " + secondNum + "으로 나눈 몫은 " + share
				+ "이고 나머지는 " + remain + "이다");
		
		/*
		 8. 쉬프트연산자(<<, >>, >>>(그래픽관련))
		   - 정수형에만 사용 가능하다.
		   - 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		   - 연산속도가 매우 뛰어남으로 사용한다.
		   - << : x<<n x*2^n의 결과와 같다.
		   - >> : x>>n x/2^n의 결과와 같다.
		 
		 */
		/*
		byte bbb = 10;
		int result2 = bbb << 32;
		System.out.println(result2);
		*/
		/*
		 9. 비교연산자
		   - 두 개의 변수 또는 리터럴을 비교하는데 사용됩니다.
		   - 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 true, false이다.
		10. 대소비교연산자( <, >, <=, >= )
		   - boolean형을 제외한 기본형변수에 사용가능하다.
		  
		  
		11. 등가비교연산자( ==, != )
		   - 모든자료형에 사용가능하다.
		   
		   
		   수식    |      연산결과
		  x>y   |  x가 y보다 클때만 true, 그외엔 false     
		  x<y   |  x가 y보다 작을때만 true, 그외엔 false
		  x>=y  |  x가 y보다 크거나 같을때만 true, 그외엔 false
		  x<=y  |  x가 y보다 작거나 같을때만 true, 그외엔 false 
		  x==y  |  x가 y보다 같을때만 true, 그외엔 false
		  y!=y  |  x가 y보다 다를때만 true, 그외엔 false
		 */
		System.out.println(5<10);
		
		int a = 50;
		int b = 35;
		System.out.println(a>b);
		System.out.println('0'==0);
		
		float ff = 0.1f;
		double dd2 = 0.1;		//2^-1
		
		System.out.println(ff == dd2);
		
		/*
		 12. 비트연산자( &, |, ^(Xor) )
		   - 이진비트연산을 수행한다.
		   - 실수형인 float과 double을 제외한 모든 기본형에 사용 가능하다.
		   
		   & (AND연산) - 피연산자 양쪽의 값이 1이면 1의 결과를 얻는다.
		   | (OR연산)  - 피연산자의 한쪽의 값이 1이면 1의 결과를 얻는다.
		   ^ (XOR연산) - 피연산자의 값이 서로 다르면 1의 결과를 얻는다.
		   
		   3  -> 00000011			
		   7  -> 00000111
		   3^7-> 00000100 => 4			//위아래로 비교한다.
		   3|7-> 00000111 => 7
		   3&7-> 00000011 => 3

		 */
		System.out.println(3&7);
		System.out.println(3|7);
		System.out.println(3^7);
		
		System.out.println(true|true);
		
		/*
		 13. 논리연산자. (&&(AND결합), ||(OR결합))
		   - 피연산자로 boolean형 값 또는 boolean형 에 결과로 하는 조건식만 허용
		   - 조건식과 반복문에서 조건식값의 결합에 활용된다.
		   - && 연산자가 ||보다 연산우선순위가 높다.
		   || : 피연산자중 어느한쪽만 true이면 true의 결과를 얻는다.
		   && : 피연산자중 양쪽모두 true일때 true의 결과를 얻는다.
		   
		 
		 
		 */
		
		//1. 변수 x에 'J'의 값을 저장해주세요
		char x = 'J';
		
		//2. x의 값이 영어 대문자이면 true의 결과를 출력하는 조건식을 만들어주세요
		
		System.out.println('A'<=x && x<='Z');
		
		//3. x의 값이 영어 소문자이면 true의 결과를 출력
		System.out.println('a'<=x && x<='z');
	
		//4. x의 값이 영어이면 true의 값을 출력
		System.out.println('A'<=x && x<='Z' || 'a'<=x && x<='z');
		
		//5. x의 값이 숫자형이면 true의 결과 출력
		System.out.println('0'<=x && x<='9');
		
		//6. x의 값이 영어, 숫자형이면 true 출력
		System.out.println('A'<=x && x<='Z' || 'a'<=x && x<='z' || '0'<=x && x<='9');
		
		/*
		 13. 삼항연산자
		   - 세 개의 피연산자를 필요로 하기 때문에 삼항연산자로 이름지어짐.
		   - 삼항연산자의 조건식의 결과에따라 true 또는 false인식이 사용된다.
		   - 기본구조  => 조건식 ? 식1 : 식2;
		 
		 
		 */
		
		int x2 = -10;
		int result = x2 > 0 ? x2 : -x2;
		System.out.println(result);
		
		//1. x3에 100의 값을 저장해주세요
		int x3 = 100;
		//2. x3의 값이 양수이면 "양수", 음수이면 "음수", 0이면 "0"의 결과값을 result4에 저장해주세요
		String result4 = x3 == 0 ? "0" : x3 > 0 ? "양수" : "음수";
		//3. result4의 값을 출력해주세요
		System.out.println(result4);
		
		/*
		 15. 대입연산자(=, op=)
		   - 변수에 값 또는 수식의 연산결과를 저장하는데 사용된다.
		   - 연산우선순위가 가장 낮다.
		   
		   
		 */
		
		//1. int형 변수 i5에 5의 값을 저장해주세요
		int i5 = 5;
		
		//2. i5에 10을 더하여 i5에 저장해주세요
		
		//i5 = i5 + 10; //  타입유지를 못한다(캐스팅 필요)
		i5 += 10;		
		
		
//		System.out.println(i5);
		
		//random
		//주사위 1~6
//		int dice = (int)(Math.random()*6+1);
//		System.out.println(dice);
		
//		int lotto = (int)(Math.random()*45+1);
//		System.out.println(lotto);
//		
//		//47(미포함) ~ 537(포함) - 48~538
//		int random1 = (int)(Math.random()*490+48);
//		
		//반올림
		//1. float 타입의 변수 f4에 3.141592를 저장해 주세요.
//		float f4 = 3.141592f;

//		int result5 = (int)(f4+0.5);
//		float result6 =  (int)(f4*1000+0.5)/1000f;
//		System.out.println(result6)
//		
		//2 158.5987 셋째자리에서반올림 두번째자리까지 표현
		/*float f5 = 158.5987f;
		float result7 = (int)(f5*100+0.5)/100f;
		System.out.println(result7);*/
		
		
		
		
	}
}
