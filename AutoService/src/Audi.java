
class Audi extends Car {

	private boolean quattro;

	public Audi(String brand, int fabricationYear, String color, boolean quattro) {
		super(brand, fabricationYear, color);
		this.quattro = quattro;
	}

	public String toString() {
		String result = (quattro == true) ? "this car is quattro" : "this car is not quattro";

		return super.toStrin() + result;

	}

}
