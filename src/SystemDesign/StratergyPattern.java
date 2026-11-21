package SystemDesign;

interface PaymentStratergy{
    void pay(double amount);
}

class CreditcardPyament implements  PaymentStratergy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "with credit card");
    }
}


class ApplePay implements PaymentStratergy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "with Apple Pay");
    }
}

class InteracID implements PaymentStratergy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "with InteracID");
    }
}

class PaymentService{
    private PaymentStratergy paymentStratergy;

    public PaymentService(PaymentStratergy stratergy){
        this.paymentStratergy = stratergy;
    }

    public void checkout(double amount){
        paymentStratergy.pay(amount);
    }
}

public class StratergyPattern {
    public static void main(String[] args) {
        PaymentStratergy stratergy = new CreditcardPyament();
        PaymentService service = new PaymentService(stratergy);

        service.checkout(100);
    }
}
