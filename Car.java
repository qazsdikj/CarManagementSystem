public class Car {
	String CarNum;
	String CarType;
	String CarMaker;
	String CarName;
	int CarAge;
	
	public Car() {
	}
	
	
	public Car(String CarName, String CarNum) {
		this.CarName = CarName;
		this.CarNum = CarNum;
	}
	
	public Car(String CarName, String CarNum, String CarType, String CarMaker, int CarAge) {
		this.CarName = CarName;
		this.CarNum = CarNum;
		this.CarType = CarType;
		this.CarMaker = CarMaker;
		this.CarAge = CarAge;
	}
	
	public void PrintInfo() {
		System.out.println("차번 : " + CarNum + " 차종 : " + CarType + " 제조사 : " + CarMaker + " 차명 : " + CarName + " 연식 : " + CarAge);

	}
	public void PrintCarNum() {
		System.out.println(CarNum);
	}
	
	public void PrintCarType() {
		System.out.println(CarType);
	}
	
	public void PrintCarMaker() {
		System.out.println(CarMaker);
	}
	
	public void PrintCarName() {
		System.out.println(CarName);
	}
	
	public void PrintCarAge() {
		System.out.println(CarAge);
	}
	
	public void SetCarNum(String CarNum) {
		this.CarNum = CarNum; 
	}
	
	public void SetCarType(String CarType) {
		this.CarType = CarType;
	}
	
	public void SetCarMaker(String CarMaker) {
		this.CarMaker = CarMaker;
	}
	
	public void SetCarName(String CarName) {
		this.CarName = CarName;
	}
	
	public void SetCarAge(int CarAge) {
		this.CarAge = CarAge;
	}

}
