package in.Ashokit;

public class CreditCardPayment implements Ipayment {

	public boolean processPayment() {
	System.out.println("Credit card payment success");
		return true;
	}

}
