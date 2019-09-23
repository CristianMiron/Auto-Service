import java.util.*;

class AutoService {

	private String name;
	private int serviceCapacity;
	private ArrayList<Car> carsInService;

	public AutoService(String name, int serviceCapacity) {
		this.name = name;
		this.serviceCapacity = serviceCapacity;
		this.carsInService = new ArrayList<Car>(serviceCapacity);
	}

	public boolean addCarInService(Car c) throws ServiceIsFullException {
		if (carsInService.size() > serviceCapacity) {
			throw new ServiceIsFullException("The service is full at this moment");
		} else {
			return carsInService.add(c);
		}
	}

	public String toString() {
		String result = "Cars in Service: \n";

		for (Car x : carsInService) {
			result += x.toString();
		}
		return result;
	}

}
