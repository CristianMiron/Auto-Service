
public class Client {

	public static void main(String[] args) {
		

		Car audi = new Audi("Audi Q7",2015,"Red",true);
		Car BMW = new BMW("BMW M3",2017,"Green",false);
		Car A4 = new Audi("Audi A4",2011,"Red",true);
		Car A3 = new Audi("Audi A3",2003,"Red",false);
		
		AutoService service = new AutoService("My service",10);
		
		
		try {
			System.out.println(service.addCarInService(audi));
			System.out.println(service.addCarInService(BMW));
			System.out.println(service.addCarInService(A4));
			System.out.println(service.addCarInService(A3));
		}catch(ServiceIsFullException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(service);
		
		
		
	}

}
