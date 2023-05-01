package Car;

import java.util.Scanner;

public class TWO_WHEELEDCar extends Car {
	public void getUserInput(Scanner input) {
		System.out.print("차량 번호 입력 : ");
		String CarNum = input.next();
		this.setCarNum(CarNum);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.print("125cc 이상의 엔진이 장착되어 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("차종 입력 : ");
				String CarType = input.next();
				this.setCarType(CarType);
			}
			
			else if (answer == 'N' || answer == 'n') {
				System.out.println("원동기장치자전거는 취급하지 않습니다.");
				return;
			}
			
			else {
			}
		}
		
		System.out.print("제조사 입력 : ");
		String CarMaker = input.next();
		this.setCarMaker(CarMaker);
		
		System.out.print("차명 입력 : ");
		String CarName = input.next();
		this.setCarName(CarName);
		
		System.out.print("연식 입력 : ");
		int CarAge = input.nextInt();
		this.setCarAge(CarAge);
		
	}
}
