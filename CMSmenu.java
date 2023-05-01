import java.util.ArrayList;
import java.util.Scanner;

import Car.Car;
import Car.TWO_WHEELEDCar;
import Car.VANCar;

public class CMSmenu {
	Car car;
	ArrayList<Car> cars = new ArrayList<Car>();
	Scanner input;
	CMSmenu(Scanner input) {
		this.input = input;
	} 
	 
	public void addCar() {
		int kind = 0;
		Car car;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.print("1. 승용차 ");
			System.out.print("2. 승합차 ");
			System.out.print("3. 화물차 ");
			System.out.print("4. 특수차 ");
			System.out.print("5. 이륜차 ");
			System.out.println(" 차량 분류 선택 : ");
			kind = input.nextInt();
			if (kind == 1) {
				car = new Car();
				car.getUserInput(input);
				cars.add(car);
				break;
			}
			else if(kind == 2) {
				car = new VANCar();
				car.getUserInput(input);
				cars.add(car);
				break;
			}
		
			else if(kind == 3) {
				car = new Car();
				car.getUserInput(input);
				cars.add(car);
				break;
			}
			
			else if(kind == 4) {
				car = new Car();
				car.getUserInput(input);
				cars.add(car);
				break;
			}
			
			else if(kind == 5) {
				car = new TWO_WHEELEDCar();
				car.getUserInput(input);
				cars.add(car);
				break;
			}
			
			else {
				System.out.println(" 차량 분류 선택 : ");
			}
		}
	}
	
	public void deleteCar() {
		System.out.print("차량 번호 입력 : ");
		String CarNum = input.next();
		int index = -1;
		for(int i = 0; i<cars.size(); i++) {
			if(cars.get(i).getCarNum().equals(CarNum)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			cars.remove(index);
			System.out.println("the car " + CarNum + " is deleted");
		}
		
		else {
			System.out.println("the car has not been registered");
			return;
		}
	}
	
	public void ViewCars() {
		System.out.println("저장된 자동차 수 : " + cars.size());
		for(int i = 0; i<cars.size(); i++) {
			cars.get(i).PrintInfo();
		}
	}
	
	public void EditCar() {
		System.out.print("차번 입력 : ");
		String CarNumber = input.next();
		for(int i = 0; i<cars.size(); i++) {
			Car car = cars.get(i);
			if (car.getCarNum().equals(CarNumber)) {
				int num = -1;
				while (num !=6 ) {
					System.out.println("**차량 정보 수정**");
					System.out.println("1. 번호 수정");
					System.out.println("2. 차종 수정");
					System.out.println("3. 제조사 수정");
					System.out.println("4. 차명 수정");
					System.out.println("5. 연식 수정");
					num = input.nextInt();
					
					if(num == 1) {
						System.out.print("차번 : ");
						String CarNum = input.next();
						car.setCarNum(CarNum);
					}
					else if(num == 2) {
						System.out.print("차종 : ");
						String CarType = input.next();
						car.setCarType(CarType);
					}
					else if(num == 3) {
						System.out.print("제조사 : ");
						String CarMaker = input.next();
						car.setCarMaker(CarMaker);
					}
					else if(num == 4) {
						System.out.print("차명 : ");
						String CarName = input.next();
						car.setCarName(CarName);
					}
					else if(num == 5) {
						System.out.print("연식 : ");
						int CarAge = input.nextInt();
						car.setCarAge(CarAge);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
}
