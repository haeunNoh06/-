import java.util.Scanner;
public class ifScore {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.print("�� ���� �Է¹����ðڽ��ϱ�? : ");
		int headcount = scan.nextInt();
		// headcount : ��� �� ��

		for ( int i = 1; i <= headcount ; i++ ) {
		// i : 1���� �����Ͽ� ��� ����ŭ for���� ������ ����

			System.out.println( i + "��° �л��� ������ �Է�");

			System.out.print("�й� : ");
			String studentID = scan.next();
			// studentID : �й�

			System.out.print("�̸� : ");
			String name = scan.next();
			// name : �̸�

			int kor, eng, mat, jav;
			// kor : ����, eng : ����, mat : ����, jav : �ڹ�
			do {
				System.out.print("���� : ");
				kor = scan.nextInt();
			} while ( kor < 0 || kor > 100 );	// ������ 0���� �۰ų� 100�� �ʰ��� ��� ��� �ݺ����� �ݺ��Ѵ�.

			do {
				System.out.print("���� : ");
				eng = scan.nextInt();
			} while ( eng < 0 || eng > 100 );

			do {
				System.out.print("���� : ");
				mat = scan.nextInt();
			} while ( mat < 0 || mat > 100 );

			do {
				System.out.print("�ڹ� : ");
				jav = scan.nextInt();
			} while ( jav < 0 || jav > 100 );

			int sum = kor+eng+mat+jav;
			// sum : ������ �հ�
			float avg = (float)sum/4;
			// avg : ���
			char grade;
			// grade : ���

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