package structural_adapter;

public class Tester {

	public static void main(String[] args) {
		XPayment xpay = new XPaymentImpl();
		
		xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Anindya");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short)235);
        xpay.setAmount(2565.23);
        
        NewPayment newPay = new XPaymentToNewPaymentAdapter(xpay);
        testNewPayObj(newPay);
	}
	
	public static void testNewPayObj(NewPayment newPay){
		System.out.println(newPay.getCardOwnerName());
		System.out.println(newPay.getCustCardNo());
		System.out.println(newPay.getCardExpMonthDate());
		System.out.println(newPay.getCVVNo());
		System.out.println(newPay.getTotalAmount());
	}
}

