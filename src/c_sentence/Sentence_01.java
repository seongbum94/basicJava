package c_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		1. 조건문 (if, switch)
		 - 조건식과 문장을 포함하는 블럭{} 으로 구성되어 있습니다.
		 - 조건식의 연산결과에 따라서 프로그램의 실행흐름을 변경할수있습니다.
		
		2. if
		 - 구조
		   1) 기본
		     if(조건식){
		         조건식이 true일때 수행될 문장
		     }
		   2) 1단 변형
		 	 if(조건식){
		         조건식이 true일때 수행될 문장
		     }else {
		         조건식이 false일때 수행될 문장
		     }
		   2) 2단 변형
		 	 if(조건식1){
		         조건식이 true일때 수행될 문장
		     }else if(조건식2){
		         조건식1이 false이고 조건식2가 true일때 수행될 문장
		     }else {
		         조건식1과 2가 false일때 수행될 문장
		     }
		     
		 
		*/
		
		//1. 변수 a에 20의 값을 저장해주세요.
		int a = -20;
		//2. a의 값이 0보다 크면 "양수"를 그렇지 않으면 "양수아님"을 출력해주세요
		if(a > 0){
			System.out.println("양수");
		}else {
			System.out.println("양수아님");
		}
		//3. a의 값이 0보다 크면 "양수"를, 0보다 작으면 "음수"를, 둘다아니면 "0"을 출력해주세요
		if(a > 0){
			System.out.println("양수");
		}else if(a < 0){
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		
		//4. 0~100사이의 랜덤한 정수를 변수 score에 저장해 주세요
		int score = (int)(Math.random()*101);
		
		
		//5. score의 점수가 90점 이상이면 "A"를 출력해주세요
		//   score의 점수가 80점 이상이면 "B"를 출력해주세요
		//   score의 점수가 70점 이상이면 "C"를 출력해주세요
		//   score의 점수가 60점 이상이면 "D"를 출력해주세요
		//   score의 점수가 60점 미만이면 "나가"를 출력해주세요
		
		System.out.println(score);
		if(score >= 90 ){
			System.out.print("A");
			if(score >= 95){
				System.out.println("+");
			}else{
				System.out.println("-");
			}	
		}else if(score >= 80){
			System.out.print("B");
			if(score >= 85){
				System.out.println("+");
			}else{
				System.out.println("-");
			}
		}else if(score >= 70){
			System.out.print("C");
			if(score >= 75){
				System.out.println("+");
			}else{
				System.out.println("-");
			}
		}else if(score >= 60){
			System.out.print("D");
			if(score >= 65){
				System.out.println("+");
			}else{
				System.out.println("-");
			}
		}else {
			System.out.println("나가");
		}
		
		/*
		2. switch문
		 - 조건의 경우의 수가 많을경우 if문보다는 switch문을 사용하는것이 더 간결하다.
		 - 조건의 결과값으로 int형 범위의 정수값을 허용합니다.
		 - 구조
		   switch(조건식){
		   case 값1 :
		   		조건식 == 값1 일때 수행될 문장
		   		break;
		   case 값2 :
		   		조건식 == 값2 일때 수행될 문장
		   		break;
		   case 값3 :
		   		조건식 == 값3 일때 수행될 문장
		   		break;
		   default :
		   		조건식의 값과 일치하는 case가 없을때 수행될 문장
		   }
		
		 */
		//1. 1~5사이의 랜덤한 정수값을 변수 aa에 저장해주세요
		int aa = (int)(Math.random()*4+1);
		//2. aa의 값이 1이면 "강남에 32평 아파트 당첨"
		//   aa의 값이 2이면 "람보르기니 당첨"
		//   aa의 값이 3이면 "LG시그니쳐셋 당첨"
		//   aa의 값이 4이면 "자전거 당첨"
		//   aa의 값이 5이면 "영만빌딩내놔"
		
		// switch문으로 만들어주세요
		System.out.println("aa : " + aa);
		
		switch(aa){
		case 1 : 
			System.out.println("강남에 32평 아파트 당첨");
			break;
		case 2 : 
			System.out.println("람보르기니 당첨");
			break;
		case 3 : 
			System.out.println("LG 시그니쳐셋 당첨");
			break;
		case 4 : 
			System.out.println("자전거 당첨");
			break;
		default : System.out.println("영만빌딩내놔");
		
		}
				
				
		//3. 아래 if구문을 switch문으로 바꿔주세요.
		
		/*if(score >= 90 ){
			System.out.print("A");
		}else if(score >= 80){
			System.out.print("B");
		}else if(score >= 70){
			System.out.print("C");
		}else if(score >= 60){
			System.out.print("D");
		}else {
			System.out.println("나가");
		}*/
		
		System.out.println("score : " + score);
		
		switch(score/10){
			case 9 : 
				System.out.println("A");
				break;
			case 8 : 
				System.out.println("B");
				break;
			case 7 : 
				System.out.println("C");
				break;
			case 6 : 
				System.out.println("D");
				break;
			default:
				System.out.println("나가");
		}
		
		//추가
		
		
		
	}

}
