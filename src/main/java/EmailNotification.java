public class EmailNotification implements Notification {
    @Override
    public void notifyCustomer() {
        System.out.println("Müşteriye e-posta gönderildi.");
    }
}
