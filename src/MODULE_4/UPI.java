package MODULE_4;

interface Payment {
    void pay(double amount);
}


class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class UPI {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();

        creditCard.pay(1500.00);
        upi.pay(750.50);
    }
}