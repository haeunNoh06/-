import java.util.Scanner;
public class ifScore {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("몇 명을 입력받으시겠습니까? : ");
		int headcount = scan.nextInt();
		// headcount : 사람 명 수

		for ( int i = 1; i <= headcount ; i++ ) {
		// i : 1부터 시작하여 사람 수만큼 for문을 돌리는 변수

			System.out.println( i + "번째 학생의 데이터 입력");

			System.out.print("학번 : ");
			String studentID = scan.next();
			// studentID : 학번

			System.out.print("이름 : ");
			String name = scan.next();
			// name : 이름

			int kor, eng, mat, jav;
			// kor : 국어, eng : 영어, mat : 수학, jav : 자바
			do {
				System.out.print("국어 : ");
				kor = scan.nextInt();
			} while ( kor < 0 || kor > 100 );	// 점수가 0보다 작거나 100을 초과한 경우 계속 반복문을 반복한다.

			do {
				System.out.print("영어 : ");
				eng = scan.nextInt();
			} while ( eng < 0 || eng > 100 );

			do {
				System.out.print("수학 : ");
				mat = scan.nextInt();
			} while ( mat < 0 || mat > 100 );

			do {
				System.out.print("자바 : ");
				jav = scan.nextInt();
			} while ( jav < 0 || jav > 100 );

			int sum = kor+eng+mat+jav;
			// sum : 점수의 합계
			float avg = (float)sum/4;
			// avg : 평균
			char grade;
			// grade : 등급

			switch ( ((int)avg)/10 ) {
				case 10 :
				case 9 : grade = 'A'; break;
				case 8 : grade = 'B'; break;
				case 7 : grade = 'C'; break;
				case 6 : grade = 'D'; break;
				default : grade = 'E'; break;
			}
			System.out.printf("%s %s %d %d %d %d %d %.2f %c\n", studentID, name, kor, eng, mat, jav, sum, avg, grade);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}