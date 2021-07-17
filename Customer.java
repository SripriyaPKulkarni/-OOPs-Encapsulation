package encapsulation;

public class Customer {

	public static void main(String[] args) {
		
		CustomerInfo pin=new CustomerInfo();
		
		//printing current atm pin
		System.out.println("current atm pin "+pin.getAtm_pin());
		
		//changing atm pin
		pin.setAtm_pin(4321);
		System.out.println("Latest atm pin "+pin.getAtm_pin());
			
	}

}


