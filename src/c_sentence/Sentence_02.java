package c_sentence;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		 1. 반복문 (for, while, do-while)
		 	- 어떤 작업을 반복적으로 수행하도록 할때 사용한다.
		 	- 반복문은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행한다.
		 	- for문은 주로 반복횟수를 알고 있을때, while 주로 반복횟수를 모를때 사용한다.
		 
		 2. for문
		 	- 기본구조 
		 	for(초기화;조건식;증감식){
		 		수행될 문장
		 	}
		 	
		 	초기화  -> 조건식 -> 수행 -> 증감식
		 	     -> 조건식 -> 수행 -> 증감식
		 */
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
		
		for(int i = 0; i < 10 ;i++){
			System.out.println(i);
		}
		
		int add = 0;
		
//		add += 1;
//		add += 2;
//		add += 4;
//		add += 5;
//		add += 3;
//		add += 6;
//		add += 7;
//		add += 8;
//		add += 9;
//		add += 10;
		
		//1. 시작  1, 끝 10, 증가량 1
		
//		for(int i = 1; i<11; i++){
//			add += i;
//		}
		
		//짝수일때만 더하기
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				add += i;
			}
		}
		
		System.out.println("add : " + add);
		
		// 7~99까지의 곱을 구해주세요
		
		long gob = 1;
		
//		result *= 7;
//		result *= 8;
//		result *= 9;
//		result *= 10;
//		result *= 11;
//		result *= 12;
//			  .
//			  . 
//			  .
//		result *= 29;
//		result *= 30;
			  
		// 시작 7 끝 999 증가량 1
		for(int i = 7; i<31; i++){
			gob *= i;
		}
		System.out.println(gob);
		
		
//		int dan;
//		
//		dan = 2;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		dan = 3;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		dan = 4;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		dan = 5;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		dan = 6;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		dan = 7;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		dan = 8;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//
//		dan = 9;
//		for(int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
//		
//		for(int a = 2; a < 10; a++){
//			for(int b = 1; b < 10; b++){
//				System.out.println(a+" * "+b+" = "+a*b);
//			}
//		}
		
		//1. 짝수단만 출력
		for(int dan = 2; dan < 10; dan++){
			if(dan % 2 == 0){
				for(int i = 1; i < 10; i++){
					System.out.println(dan + " * " + i + " = " + dan * i);
				}
			}
		}
		//2. 홀수곱만 출력
		for(int dan = 2; dan < 10; dan++){
			for(int i = 1; i < 10; i++){
				if (i % 2 == 1){
					System.out.println(dan + " * " + i + " = " + dan * i);
				}
			}
		}
		//3. 짝수단의 홀수곱만 출력
		for(int dan = 2; dan < 10; dan++){
			if(dan % 2 == 0){
				for(int i = 1; i < 10; i++){
					if (i % 2 == 1){
						System.out.println(dan + " * " + i + " = " + dan * i);
					}
				}
			}
		}
		
		/*
		 3. while문 
		 	- 조건식과 수행해야 될 블럭{}만으로 구성되어있다.
		 	- 기본구조
		 	whlie(조건식){
		 		조건식이 true일때 수행되는 문장
		 	}
		*/
		
		for(int i = 1; i< 10; i++){
			System.out.println(i);
		}
		
		int num = 1;
		while(num < 10){
			System.out.println(num);
			num++;
		}
		
		//1. 1~10까지의 합을 구해주세요(while문 이용)
		int sum = 0;
		num = 1;
		while(num < 11){
			sum += num;
			num++;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		//2. 1~10까지의 홀수의 합을 구해주세요(while문 이용)
		sum = 0;
		num = 1;
		while(num < 11){
			if(num%2==1){
				sum += num;
			}
			num++;
		}
		System.out.println("1~10까지의 홀수의 합 : "+sum);
		
		//3. 구구단을 while문 만을 이용해서 만들어주세요
		int dan = 2;

		while(dan < 10){
			int i = 1;
			while(i < 10){
				System.out.println(dan+" * "+i+" = "+dan*i);
				i++;
			}
			dan++;
		}
		
		//4. 5~? 더하였을때 200이상이 되는가?
		sum = 0;
		num = 5;
		while(sum<200){
			sum += num;
			num++;
		}
		System.out.println(num);
		// String 
		String str = "12345";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
	}
}