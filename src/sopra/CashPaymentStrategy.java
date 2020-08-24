package sopra;

public class CashPaymentStrategy implements OldWayPaymentStrategy{

	@Override
	public double pay(double amount) {
		double serviceCharge = 5.00;
        return amount + serviceCharge;
	}

}
