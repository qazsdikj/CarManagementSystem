import java.util.Scanner;

public class CMS {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CMSmenu cmsmenu = new CMSmenu(input);
		
		int num = 6;
		
		while (num !=5) {
			System.out.println("1. 차량 추가");
			System.out.println("2. 차량 제거");
			System.out.println("3. 차량 수정");
			System.out.println("4. 차량 정보");
			System.out.println("5. 나가기");
			System.out.println("1-5 중에 선택");
			num = input.nextInt();
			
			if (num == 1) {
				cmsmenu.addCar();
			}
			else if (num == 2) {
				cmsmenu.deleteCar();
			}
			else if (num == 3) {
				cmsmenu.EditCar();
			}
			else if (num == 4) {
				cmsmenu.ViewCars();
			}
			else {
				continue;
			}
		}
	}
}
