package Car;

import java.util.Scanner;

public class VANCar extends Car {
	
	public void getUserInput(Scanner input) {
		System.out.print("차량 번호 입력 : ");
		String CarNum = input.next();
		this.setCarNum(CarNum);
		
		char answer = 'x';
		char answer2 = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.print("15인승 이상입니까? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'N' || answer == 'n') {
				while (answer2 != 'y' && answer2 != 'Y' && answer2 != 'N' && answer2 != 'n') {
					System.out.print("경차 규격을 만족합니까? (Y/N)");
					answer2 = input.next().charAt(0);
					if (answer2 == 'N' || answer2 == 'n') {
						this.setCarType("소형 승합차");
						break;
					}
					
					else if (answer2 == 'Y' || answer2 == 'y'){
						this.setCarType("경형 승합차");
						break;
					}
					
					else {
					}
				}
			}
			
			else if (answer == 'Y' || answer == 'y') {
				System.out.println("버스");
				System.out.print("버스 종류 입력 : ");
				String CarType = input.next();
				this.setCarType(CarType);
				break;
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
