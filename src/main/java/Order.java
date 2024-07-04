public class Order {
    private int orderId;
    private String status;
    private double amount;

    public void createOrder() {
        System.out.println("Sipariş oluşturuldu.");
    }

    public void updateOrder() {
        System.out.println("Sipariş güncellendi.");
    }

    public void deleteOrder() {
        System.out.println("Sipariş silindi.");
    }
}
