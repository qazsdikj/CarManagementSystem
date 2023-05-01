package Car;

import java.util.Scanner;

public class Car {

	protected CarKind kind = CarKind.PASSENGER;
	protected String CarNum;
	protected String CarType;
	protected String CarMaker;
	protected String CarName;
	protected int CarAge;
	
	public Car() {
	}
	
	
	public Car(String CarName, String CarNum) {
		this.CarName = CarName;
		this.CarNum = CarNum; 
	}
	
	public Car(String CarNum, String CarType, String CarMaker, String CarName, int CarAge) {
		this.CarName = CarName;
		this.CarNum = CarNum;
		this.CarType = CarType;
		this.CarMaker = CarMaker;
		this.CarAge = CarAge;
	}
	
	public CarKind getKind() {
		return kind;
	}


	public void setKind(CarKind kind) {
		this.kind = kind;
	}


	public String getCarNum() {
		return CarNum;
	}


	public void setCarNum(String carNum) {
		CarNum = carNum;
	}


	public String getCarType() {
		return CarType;
	}


	public void setCarType(String carType) {
		CarType = carType;
	}


	public String getCarMaker() {
		return CarMaker;
	}


	public void setCarMaker(String carMaker) {
		CarMaker = carMaker;
	}


	public String getCarName() {
		return CarName;
	}


	public void setCarName(String carName) {
		CarName = carName;
	}


	public int getCarAge() {
		return CarAge;
	}


	public void setCarAge(int carAge) {
		CarAge = carAge;
	}

	public void PrintInfo() {
		System.out.println("차번 : " + CarNum + " 차종 : " + CarType + " 제조사 : " + CarMaker + " 차명 : " + CarName + " 연식 : " + CarAge);

	}
	
	public void getUserInput(Scanner input) {
		System.out.print("차량 번호 입력 : ");
		String CarNum = input.next();
		this.setCarNum(CarNum);
		
		System.out.print("차종 입력 : ");
		String CarType = input.next();
		this.setCarType(CarType);
		
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
