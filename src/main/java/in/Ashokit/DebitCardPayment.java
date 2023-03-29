package in.Ashokit;

public class DebitCardPayment implements Ipayment {

	public boolean processPayment() {
		System.out.println("DebitCard Payment Success");
		return true;
	}

}
