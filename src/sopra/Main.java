package sopra;

interface PaymentStrategy{  
    double pay(double amount);  
}
public class Main {
	
	public static void main (String args[])
	{
		double amountCash = 123;
		double amountCC = 200;
		PaymentStrategy payWithCash = (amount) ->{
			double serviceCharge = 5.00;
			return serviceCharge+amountCash;
		};
		PaymentStrategy payWithCC = (amount) ->{
			double serviceCharge = 5.00;
			double creditCardFee = 10.00;
			return serviceCharge+creditCardFee+amountCC;
		};		
		
		
		System.out.println(" Amount: " + amountCash + " and payed with cash = " + payWithCash.pay(amountCash));
		System.out.println(" Amount: " + amountCC + " and payed with cash = " + payWithCC.pay(amountCC));
	}

}
