package Array;

import java.util.Scanner;
public class IfScore {
		public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);

			System.out.print("몇 명을 입력받으시겠습니까? : ");
			int headcount = scan.nextInt();		//사람 명 수
			
			System.out.print("몇 과목을 입력하시겠습니까? : ");
			int scoreCnt = scan.nextInt();		//과목 수

			String studentID = "";				//학번
			String name = "";					//이름
			
			int[] score = new int[scoreCnt+1];			//과목 수, 합계도 들어있어야 함
			
			//int sum = 0;						//점수의 합계
			float avg;							//평균
			char grade;							//등급
			
			String[] subj_name = {"국어", "영어", "수학", "자바", "일본어", "기술가정", "C"};		//과목명
			
			// i : 1부터 시작하여 사람 수만큼 for문을 돌리는 변수
			for ( int i = 1; i <= headcount ; i++ ) {
				System.out.println( i + "번째 학생의 데이터 입력");

				System.out.print("학번 : ");
				studentID = scan.next();					//학번

				System.out.print("이름 : ");
				name = scan.next();							//이름

				//과목명과 점수 입력받기
				for ( int j = 0; j < score.length-1; j++ ) {
					do {
						System.out.print(subj_name[j]+" : ");
						score[j] = scan.nextInt();
					} while ( score[j] < 0 || score[j] > 100 );	// 점수가 0보다 작거나 100을 초과한 경우 계속 반복문을 반복한다.
					
					//점수의 합계
					score[score.length-1] += score[j];
				}
				
				//점수의 평균
				avg = (float)score[score.length-1]/scoreCnt;
				
				//점수의 성취도
				switch ( ((int)avg)/10 ) {
					case 10 :
					case 9 : grade = 'A'; break;
					case 8 : grade = 'B'; break;
					case 7 : grade = 'C'; break;
					case 6 : grade = 'D'; break;
					default : grade = 'E'; break;
				}
				
				//학번, 이름 출력
				System.out.printf("%s %s ", studentID, name);
				
				//점수, 점수의 합계 출력
				for ( int j = 0; j < score.length; j++ ) {
					System.out.printf("%d ",score[j]);
				}
				
				//점수의 평균, 성취도 출력
				System.out.printf("%.2f %c", avg, grade);
				System.out.println("");
				System.out.println("");
				
				//다음 학생을 입력받기 위해 합계 값 초기화
				score[score.length-1] = 0;
			}
		}
}
