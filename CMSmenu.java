import java.util.ArrayList;
import java.util.Scanner;

public class CMSmenu {
	Car car;
	ArrayList<Car> cars = new ArrayList<Car>();
	Scanner input;
	CMSmenu(Scanner input) {
		this.input = input;
	}
	public void addCar() {
		car = new Car();
		System.out.print("차량 번호 입력 : ");
		car.CarNum = input.next();
		car.PrintCarNum();
		System.out.print("차종 입력 : ");
		car.CarType = input.next();
		car.PrintCarType();
		System.out.print("제조사 입력 : ");
		car.CarMaker = input.next();
		car.PrintCarMaker();
		System.out.print("차명 입력 : ");
		car.CarName = input.next();
		car.PrintCarName();
		System.out.print("연식 입력 : ");
		car.CarAge = input.nextInt();
		car.PrintCarAge();
		
		cars.add(car);
	}
	
	public void deleteCar() {
		System.out.print("차량 번호 입력 : ");
		String CarNum = input.next();
		int index = -1;
		for(int i = 0; i<cars.size(); i++) {
			if(cars.get(i).CarNum.equals(CarNum)) {
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
		for(int i = 0; i<cars.size(); i++) {
			cars.get(i).PrintInfo();
		}
	}
	
	public void EditCar() {
		System.out.print("차번 입력 : ");
		String CarNumber = input.next();
		for(int i = 0; i<cars.size(); i++) {
			Car car = cars.get(i);
			if (car.CarNum.equals(CarNumber)) {
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
						car.SetCarNum(input.next());
					}
					else if(num == 2) {
						System.out.print("차종 : ");
						car.SetCarType(input.next());
					}
					else if(num == 3) {
						System.out.print("제조사 : ");
						car.SetCarMaker(input.next());
					}
					else if(num == 4) {
						System.out.print("차명 : ");
						car.SetCarName(input.next());
					}
					else if(num == 5) {
						System.out.print("연식 : ");
						car.SetCarAge(input.nextInt());
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
