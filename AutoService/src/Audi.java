
class Audi extends Car {

	private boolean quattro;

	public Audi(String brand, int fabricationYear, String color, boolean quattro) {
		super(brand, fabricationYear, color);
		this.quattro = quattro;
	}

	public String toString() {
		String result = (quattro == true) ? " the car is quattro" : " the car is not quattro";

		return super.toString() + result;

	}

}
