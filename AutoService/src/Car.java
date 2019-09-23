
abstract class Car {

	private String brand;
	private int fabricationYear;
	private String color;

	public Car(String brand, int fabricationYear, String color) {
		this.brand = brand;
		this.fabricationYear = fabricationYear;
		this.color = color;
	}

	public String toStrin() {
		return "Brand: " + brand + " Fabrication year: " + fabricationYear + " Color: " + color;
	}

}
