import java.util.Scanner;

public class CMSmenu {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
			System.out.println("1. 차량 추가");
			System.out.println("2. 차량 제거");
			System.out.println("3. 차량 수정");
			System.out.println("4. 차량 정보");
			System.out.println("5. 메뉴 보기");
			System.out.println("6. 나가기");
			System.out.println("1-6 중에 선택");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("차량 번호 입력 : ");
				String Carnum = input.next();
				System.out.print("차종 입력 : ");
				String CarType = input.next();
				System.out.print("제조사 입력 : ");
				String CarMaker = input.next();
				System.out.print("차명 입력 : ");
				String CarName = input.next();
				System.out.print("연식 입력 : ");
				int CarAge = input.nextInt();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		
		}
	}
}
