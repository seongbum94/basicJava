package z_exam;

public class Exam_04 {
	public static void main(String[] args) {
		
		/*
		  
		  [4-1] 다음의 문장들을 조건식으로 표현하라.
			1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
			2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
			3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
			4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
			5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
			6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
			않을 때 true인 조건식
			7. boolean형 변수 powerOn가 false일 때 true인 조건식
			8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		  
		  [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.

		  [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		  	int result = 0;
		
			for(int i = 1 ; i<=10; i++){
				System.out.print("(");
			  		for(int j = 1; j<=i; j++){
			  			result += j;
				  		System.out.print(j);
			  			if(j == i){
			  				break;
		  				}
		  			System.out.print("+");
			  		}
		  		System.out.print(")");
		  		
		  		if(i == 10){
		  			break;
		  		}
		  		System.out.print("+");
		  	}
		  	
		  [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
			int sw = 1;
			int sum = 0;
			int i;
		
			for(i = 1; sum<=100; i++){
				sum += i*sw;
				sw = -sw;
			}
		
			System.out.println(i);

		  [4-5] 다음의 for문을 while문으로 변경하시오.

			public class Exercise4_5 {
				public static void main(String[] args) {
					for(int i=0; i<=10; i++) {
						for(int j=0; j<=i; j++)
							System.out.print("*");
						System.out.println();
					}
				} // end of main
			} // end of class
				
			답 : 
			
			int i=0;
			
			
			while(i<=10){
				int j=0;
				while(j<=i){
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
				
		[4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
			int dice1;
			int dice2;
			
			for(dice1 = 1;dice1 <= 6;dice1++){
				for(dice2 = 1; dice2 <= 6; dice2++){
					if(dice1+dice2 == 10)
						System.out.println(dice1+","+dice2);
				}
			}
		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
			class Exercise4_7 {
				public static void main(String[] args) {
					int value = (  (1)  );
					System.out.println("value:"+value);
				}
			}
			답 : 
			(int)(Math.random()*6+1)
		
		[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는0<=x<=10, 0<=y<=10 이다.
		답 : 	
		for(int x = 0; x <= 10; x++){
			for(int y = 0; y <= 10; y++){
				if(x*2+4*y == 10){
					System.out.println("x="+x+", y="+y);
				}
			}
		}
		
		[4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
			     만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. 
			  (1)에 알맞은 코드를 넣으시오.
			  [Hint] String클래스의 charAt(int i)을 사용
			  
			  class Exercise4_9 {
				public static void main(String[] args) {
					String str = "12345";
						int sum = 0;
						for(int i=0; i < str.length(); i++) {
							sum += charAt(i);
						}
					System.out.println("sum="+sum);
					}
			  	}	
			  	
		[4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를완성하라. 
		만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
		(1)에 알맞은 코드를 넣으시오.
		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
			class Exercise4_10 {
				public static void main(String[] args) {
					int num = 12345;
					int sum = 0;
					
					(1) 알맞은 코드를 넣어 완성하시오.
					
					System.out.println("sum="+sum);
				}
			}
			
			답 : 
			
			int num = 12345;
			int result = 0;
				
			while(!(num/10 == 0)){
				if(num / 10 < 10){
					result += num/10;
				}
				result += num % 10;
				num/=10;
			}
			
			System.out.println(result);
			
		*/
		
		
		
	}
}