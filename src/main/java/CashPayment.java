public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Nakit para ile ödeme yapıldı: " + amount);
    }
}
