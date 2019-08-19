package z_exam;

public class Exam_04 {
	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		while(i<=10){
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

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
			int j=0;
			
			while(i<=10){
				while(j<=i){
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
				
				
		 * */
		

		
	}
}